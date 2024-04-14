package syntaxtree;
import syntaxtree.visitor.*;

public class This extends Exp {
    public void accept(Visitor v) {
        v.visit(this);
    }

}