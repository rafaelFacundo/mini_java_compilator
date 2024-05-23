package Mips;
import Frame.*;
import Temp.*;
import Tree.*;
import utils.Convert;


import java.util.List;


public class Codegen {

    Frame frame;
    public Assem.InstrList ilist = null, last = null;
    
    public Codegen(Frame f) {
        frame = f;
    }

    public void emit(Assem.Instr inst) {
        if (last != null)
            last = last.tail = new Assem.InstrList(inst, null);
        else
            last = ilist = new Assem.InstrList(inst, null);
    }

    public void munchStm(Stm s) {
        if (s instanceof SEQ) {
            munchStm(((SEQ) s).s1);
            munchStm(((SEQ) s).s2);
        }
        if (s instanceof MOVE)
            munchMove(((MOVE) s).dst, ((MOVE) s).src);
        if (s instanceof LABEL)
            emit(new Assem.LABEL( (((LABEL) s).label) + ":\n", ((LABEL) s).label));
        if (s instanceof JUMP)
            munchJump((JUMP) s);
        if (s instanceof CJUMP)
            munchCJump((CJUMP) s);
        if (s instanceof EXPR) {
            if( ((EXPR)s).exp instanceof CALL)
            {
                Temp r = munchExp(((CALL) (((EXPR) s).exp)).func);
                TempList l = munchArgs(0, ((CALL) (((EXPR) s).exp)).args);
                emit(new Assem.OPER("CALL " + ((NAME)((CALL) (((EXPR) s).exp)).func).cnst + "\n",
                        null, new TempList(r, l)));
            }
        }
    }

    Temp munchExp(Exp s) {
        if (s instanceof MEM)
            return munchMem((MEM) s);
        if (s instanceof CONST) {
            Temp r = new Temp();
            emit(new Assem.OPER("ADDI "+r +" <- r0+" + ((CONST) s).cnst
                    + "\n", new TempList(r, null), null));
            return r;
        }
        if (s instanceof BINOP)
            return munchBinop((BINOP) s);
        if (s instanceof TEMP)
            return ((TEMP) s).temp;
        if( s instanceof NAME)
            return new Temp();
        return null;
    }

    private TempList munchArgs(int i, ExpList args) {
        ExpList temps = args;
        TempList retorno = null;
        while (temps != null) {
            Temp x = munchExp(temps.head);
            retorno = new TempList(x,retorno);
            temps = temps.tail;
        }
        return retorno;
    }

    private void munchCJump(CJUMP s) {
        Temp r = munchExp(new BINOP(BINOP.MINUS, s.e1, s.e2));
        if (s.operador == CJUMP.EQ) {
            emit(new Assem.OPER("BRANCHEQ if " + r + " = 0 goto " + s.t+"\n",
                    null, new TempList(r, null), new LabelList(
                    s.t, null)));
        } else if (s.operador == CJUMP.GE) {
            emit(new Assem.OPER("BRANCHGE if " + r + " >= 0 goto " + s.t+"\n",
                    null, new TempList(r, null), new LabelList(
                    s.t, null)));
        } else if (s.operador == CJUMP.LT) {
            emit(new Assem.OPER("BRANCHLT if " + r + " < 0 goto " + s.t+"\n",
                    null, new TempList(r, null), new LabelList(
                    s.t, null)));
        } else if (s.operador == CJUMP.NE) {
            emit(new Assem.OPER("BRANCHNE if " + r + " != 0 goto " + s.t+"\n",
                    null, new TempList(r, null), new LabelList(
                    s.t, null)));
        }
        else if (s.operador == CJUMP.GT) {
            emit(new Assem.OPER("BRANCHGT if " + r + " > 0 goto " + s.t+"\n",
                    null, new TempList(r, null), new LabelList(
                    s.t,null)));
        }
        else
            emit(new Assem.OPER("goto " + s.f.toString()+"\n", null, null,
                    new LabelList(s.f, null)));
    }

    private void munchJump(JUMP s) {
        emit(new Assem.OPER("goto " + ((NAME) s.e).cnst.toString() + "\n",
                null, null, new LabelList(((NAME) s.e).cnst, null)));
    }

    void munchMove(MEM dst, Exp src) {
        if (dst.exp instanceof BINOP && ((BINOP) dst.exp).operador == BINOP.PLUS
                && ((BINOP) dst.exp).e2 instanceof CONST) {
            TempList destino = new TempList(
                    munchExp(((BINOP) dst.exp).e1), null);

            TempList fonte = new TempList(munchExp(src), null);

            emit(new Assem.OPER("STORE M[" + frame.FP() + " + " + destino.head
                    + " + " + ((CONST) ((BINOP) dst.exp).e2).cnst
                    + " ] <- " + fonte.head+"\n", destino, fonte));
        }
        else if (dst.exp instanceof BINOP
                && ((BINOP) dst.exp).operador == BINOP.PLUS
                && ((BINOP) dst.exp).e1 instanceof CONST) {

            TempList destino = new TempList(
                    munchExp(((BINOP) dst.exp).e2), null);

            TempList fonte = new TempList(munchExp(src), null);

            emit(new Assem.OPER("STORE M[" + frame.FP() + " + " + destino.head
                    + " + " + ((CONST) ((BINOP) dst.exp).e1).cnst + "] <- "
                    + fonte.head +"\n", destino, fonte));
        }

        else if (src instanceof MEM) {
            TempList destino = new TempList(munchExp(dst.exp), null);
            TempList fonte = new TempList(munchExp(src), null);

            emit(new Assem.OPER("MOVEM M[" + frame.FP() + " + " + destino.head
                    + "] <- M[" + fonte.head + "]"+"\n", destino, fonte));
        }

        else if (dst.exp instanceof MEM && ((MEM) dst.exp).exp instanceof CONST) {

            TempList destino = new TempList(munchExp(dst.exp), null);
            TempList fonte = new TempList(munchExp(src), null);

            emit(new Assem.OPER("STORE M[" + frame.FP() + " + "
                    + ((CONST) ((MEM) dst.exp).exp).cnst + "] <- "
                    + fonte.head+"\n", destino, fonte, null));
        }

        else {
            TempList destino = new TempList(munchExp(dst.exp), null);
            TempList fonte = new TempList(munchExp(src), null);
            emit(new Assem.OPER("STORE M[" + frame.FP() + " + " + destino.head
                    + " + 0] <- " + fonte.head+"\n", destino, fonte));
        }

    }

    void munchMove(TEMP dst, Exp src) {
        Temp t = munchExp(src);
        emit(new Assem.MOVE("MOVEA " + dst.temp+ " <- " + t+"\n", dst.temp, t));
    }

    void munchMove(Exp dst, Exp src) {

        // MOVE(d, e)
        if (dst instanceof MEM)
            munchMove((MEM) dst, src);
        if (dst instanceof TEMP && src instanceof CALL) {
            Temp r = munchExp(((CALL) src).func);
            TempList l = munchArgs(0, ((CALL) src).args);
            emit(new Assem.OPER("CALL " + ((NAME)((CALL) src).func).cnst + "\n",
                    new TempList(r,null), l));
        } else if (dst instanceof TEMP)
            munchMove((TEMP) dst, src);
    }

    private Temp munchBinop(BINOP s) {
        // munchExp(BINOP(PLUS,e1,CONST (i)))
        if (s.operador == BINOP.PLUS && s.e2 instanceof CONST) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1), null);
            emit(new Assem.OPER("ADDI "+ r + " <- " + fonte.head + " + "
                    + ((CONST) s.e2).cnst + "\n",
                    new TempList(r, null), fonte));
            return r;

        }

        // munchExp(BINOP(PLUS,CONST (i),e1))
        if (s.operador == BINOP.PLUS && s.e1 instanceof CONST) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e2), null);
            emit(new Assem.OPER("ADDI "+ r + " <- "  + fonte.head + " + "
                    + ((CONST) s.e1).cnst + "\n",
                    new TempList(r, null), fonte));
            return r;

        }

        // munchExp(BINOP(PLUS,e1,e2))
        if (s.operador == BINOP.PLUS) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1),
                    new TempList(munchExp(s.e2), null));
            emit(new Assem.OPER("ADD "+ r + " <- " + fonte.head + "+"
                    + fonte.tail.head + "\n", new TempList(r, null), fonte));
            return r;
        }

        // munchExp(BINOP(MUL,e1,e2))
        if (s.operador == BINOP.MUL) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1),
                    new TempList(munchExp(s.e2), null));
            emit(new Assem.OPER("MUL "+ r + " <- " + fonte.head + "*"
                    + fonte.tail.head + "\n", new TempList(r, null), fonte));
            return r;
        }

        // munchExp(BINOP(DIV,e1,e2))
        if (s.operador == BINOP.DIV) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1),
                    new TempList(munchExp(s.e2), null));
            emit(new Assem.OPER("DIV "+ r + " <- " + fonte.head + "/"
                    + fonte.tail.head + "\n", new TempList(r, null), fonte));
            return r;
        }

        // munchExp(BINOP(SUB,e1,CONST(i)))
        if (s.operador == BINOP.MINUS && s.e2 instanceof CONST) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1),null);
            emit(new Assem.OPER("SUBI "+ r + " <- " + fonte.head + " - "
                    + ((CONST) s.e2).cnst + "\n",
                    new TempList(r, null), fonte));
            return r;

        }

        // munchExp(BINOP(SUB,e1,e2))
        if (s.operador == BINOP.MINUS) {
            Temp r = new Temp();
            TempList fonte = new TempList(munchExp(s.e1),
                    new TempList(munchExp(s.e2), null));
            emit(new Assem.OPER("SUB "+r +" <- " + fonte.head + "-"
                    + fonte.tail.head + "\n", new TempList(r, null), fonte));
            return r;
        }

        return null;
    }

    private Temp munchMem(MEM s) {

        // munchExp(MEM(BINOP(PLUS,e1,CONST(i))))
        if (s.exp instanceof BINOP
                && (((BINOP) s.exp).operador == BINOP.PLUS)
                && ((BINOP) s.exp).e2 instanceof CONST) {
            Temp r = new Temp();
            emit(new Assem.OPER(
                    "LOAD "+ r +" <- M[‘s0+"
                            + ((CONST) (((BINOP) s.exp).e2)).cnst
                            + "]\n",
                    new TempList(r, null),
                    new TempList(munchExp(((BINOP) s.exp).e1), null)));
            return r;

        }

        // munchExp(MEM(BINOP(PLUS,CONST(i),e1)))
        if (s.exp instanceof BINOP
                && (((BINOP) s.exp).operador == BINOP.PLUS)
                && ((BINOP) s.exp).e1 instanceof CONST) {
            Temp r = new Temp();
            emit(new Assem.OPER("LOAD "+r + " <- M[‘s0+"
                    + ((CONST) (((BINOP) s.exp).e1)).cnst + "]\n",
                    new TempList(r, null), new TempList(
                    munchExp(((BINOP) s.exp).e2), null)));
            return r;

        }

        // munchExp(MEM(CONST (i)))
        if (s.exp instanceof CONST) {
            Temp r = new Temp();
            emit(new Assem.OPER("LOAD "+r+ "<- M[r0+" + ((CONST) s.exp).cnst
                    + "]\n", new TempList(r, null), null));
            return r;
        }

        // munchExp(MEM(e1))
        Temp r = new Temp();
        emit(new Assem.OPER("LOAD "+ r +" <- M[‘s0+0]\n",
                new TempList(r, null), new TempList(munchExp(s.exp),
                null)));
        return r;

    }

    public Assem.InstrList codegen(Stm s) {
        Assem.InstrList l;
        munchStm(s);
        l = ilist;
        ilist = last = null;
        return l;
    }

    public Assem.InstrList codegen(List<Tree.Stm> stms) {
        Assem.InstrList first=null, last=null;
        for (int i = 0; i < stms.size(); ++i) {
            Assem.InstrList inst = codegen(stms.get(i));
            if (last == null) {
                first = last = inst;
            } else {
                while (last.tail != null) {
                    last = last.tail;
                }
                last = last.tail = inst;
            }
        }

        return first;
    }
}

