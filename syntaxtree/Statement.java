package syntaxtree;

import syntaxtree.visitor.*;

public abstract class Statement {
    public abstract void accept(Visitor v);

}