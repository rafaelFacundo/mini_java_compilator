package syntaxtree;

import syntaxtree.visitor.*;

public class IntArrayType extends Type {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return "int[]";
    }
}