package Syntaxtree;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class Formal {
    public Type t;
    public Identifier i;

    public Formal(Type at, Identifier ai) {
        t=at; i=ai;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public IRtree.ExpEnc accept(IRVisitor irVisitor) {
        return irVisitor.visit(this);
    }

}