package Tree;

import Temp.Label;

public class CJUMP extends Stm {
    public Exp e1, e2;
    public int operador;
    public Label t, f;

    public final static int EQ = 1, NE = 2, LT = 3, GT = 4, LE = 5, GE = 6, ULT = 7, ULE = 8, UGT = 9, UGE = 10;

    public CJUMP(int operador, Exp e1, Exp e2, Label t, Label f) {
        this.operador = operador;
        this.e1 = e1;
        this.e2 = e2;
        this.t = t;
        this.f = f;
    }

    public ExpList kids() {
        return new ExpList(e1, new ExpList(e2, null));
    };

    public Stm build(ExpList kids) {
        return new CJUMP(operador, kids.head, kids.tail.head, t, f);
    };

    public static int notRel(int relop) {
        switch (relop) {
            case EQ:  return NE;
            case NE:  return EQ;
            case LT:  return GE;
            case GE:  return LT;
            case GT:  return LE;
            case LE:  return GT;
            case ULT: return UGE;
            case UGE: return ULT;
            case UGT: return ULE;
            case ULE: return UGT;
            default: throw new Error("bad relop in CJUMP.notRel");
        }
      }

}
