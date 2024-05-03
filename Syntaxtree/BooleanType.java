package Syntaxtree;

import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class BooleanType extends Type {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return "boolean";
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public ExpEnc accept(IRVisitor v) {
        return v.visit(this);
    }
}