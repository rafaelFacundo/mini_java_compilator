package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class If extends Statement {
    public Exp e;
    public Statement s1,s2;

    public If(Exp ae, Statement as1, Statement as2) {
        e=ae; s1=as1; s2=as2;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public ExpEnc accept(IRVisitor v) {
        return v.visit(this);
    }
}
