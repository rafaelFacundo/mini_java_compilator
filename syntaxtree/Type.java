package syntaxtree;
import syntaxtree.visitor.*;

public abstract class Type {
    public abstract void accept(Visitor v);
}