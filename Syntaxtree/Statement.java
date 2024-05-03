package Syntaxtree;

import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public abstract class Statement {
    public abstract void accept(Visitor v);
    public abstract Type accept(TypeVisitor v);
    public abstract IRtree.ExpEnc accept(IRVisitor irVisitor);
}