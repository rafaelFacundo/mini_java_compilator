package syntaxtree;
import syntaxtree.visitor.*;

public abstract class ClassDecl {
    public abstract void accept(Visitor v);

}
