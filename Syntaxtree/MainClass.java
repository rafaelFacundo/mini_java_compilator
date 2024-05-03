package Syntaxtree;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public class MainClass {
    public Identifier i1,i2;
    public Statement s;

    public MainClass(Identifier ai1, Identifier ai2, Statement as) {
        i1=ai1; i2=ai2; s=as;
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
