package Syntaxtree;
import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class Call extends Exp {
    public Exp e;
    public Identifier i;
    public ExpList el;

    public Call(Exp ae, Identifier ai, ExpList ael) {
        e=ae; i=ai; el=ael;
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