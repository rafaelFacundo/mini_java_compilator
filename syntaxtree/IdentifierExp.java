package syntaxtree;
import syntaxtree.visitor.*;

public class IdentifierExp extends Exp {
    public String s;
    public IdentifierExp(String as) {
        s=as;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}