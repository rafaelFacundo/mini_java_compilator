package syntaxtree;
import syntaxtree.visitor.*;

public class True extends Exp {
    public void accept(Visitor v) {
        v.visit(this);
    }

}