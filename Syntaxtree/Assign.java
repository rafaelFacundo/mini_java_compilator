package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class Assign extends Statement {
    public Identifier i;
    public Exp e;

    public Assign(Identifier ai, Exp ae) {
        i=ai; e=ae;
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
