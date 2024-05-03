package Syntaxtree;
import Syntaxtree.visitor.*;

public class NewObject extends Exp {
    public Identifier i;

    public NewObject(Identifier ai) {
        i=ai;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString() {
        return i.toString();
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}