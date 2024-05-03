package Syntaxtree;

import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class ArrayAssign extends Statement {
    public Identifier i;
    public Exp e1,e2;

    public ArrayAssign(Identifier ai, Exp ae1, Exp ae2) {
        i=ai; e1=ae1; e2=ae2;
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
