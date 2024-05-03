package Syntaxtree;

import java.util.Vector;

import IRtree.ExpEnc;
import IRtree.IRVisitor;
import Syntaxtree.visitor.*;

public abstract class Exp {
    public abstract void accept(Visitor v);
    public abstract Type accept(TypeVisitor v);
    public abstract ExpEnc accept(IRVisitor irVisitor);
}




