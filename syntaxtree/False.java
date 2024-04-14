package syntaxtree;
import syntaxtree.visitor.*;

public class False extends Exp {
    public void accept(Visitor v) {
        v.visit(this);
    }

}