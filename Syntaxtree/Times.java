package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class Times extends Exp {
    public Exp e1,e2;

    public Times(Exp ae1, Exp ae2) {
        e1=ae1; e2=ae2;
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