package Syntaxtree;

import Syntaxtree.visitor.*;

public class IntArrayType extends Type {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return "int[]";
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}