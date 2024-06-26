package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class While extends Statement {
    public Exp e;
    public Statement s;

    public While(Exp ae, Statement as) {
        e=ae; s=as;
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
