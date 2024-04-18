package syntaxtree;
import syntaxtree.visitor.*;

public class Assign extends Statement {
    public Identifier i;
    public Exp e;

    public Assign(Identifier ai, Exp ae) {
        i=ai; e=ae;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}