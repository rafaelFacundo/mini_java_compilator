package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class ArrayLength extends Exp {
    public Exp e;

    public ArrayLength(Exp ae) {
        e=ae;
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