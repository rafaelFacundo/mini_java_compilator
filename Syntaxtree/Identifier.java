package Syntaxtree;

import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class Identifier {
    public String s;

    public Identifier(String as) {
        s=as;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public String toString(){
        return s;
    }

    public IRtree.ExpEnc accept(IRVisitor irVisitor) {
        return irVisitor.visit(this);
    }

}