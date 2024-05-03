package Syntaxtree;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public abstract class ClassDecl {
    public abstract void accept(Visitor v);
    public abstract Type accept(TypeVisitor v);
    public abstract IRtree.ExpEnc accept(IRVisitor irVisitor);
}
