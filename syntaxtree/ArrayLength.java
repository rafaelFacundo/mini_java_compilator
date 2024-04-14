package syntaxtree;
import syntaxtree.visitor.*;

public class ArrayLength extends Exp {
    public Exp e;

    public ArrayLength(Exp ae) {
        e=ae;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}