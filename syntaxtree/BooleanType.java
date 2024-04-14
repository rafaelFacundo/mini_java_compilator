package syntaxtree;

import syntaxtree.visitor.*;

public class BooleanType extends Type {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return "boolean";
    }
}