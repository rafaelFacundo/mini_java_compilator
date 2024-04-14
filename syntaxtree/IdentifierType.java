package syntaxtree;

import syntaxtree.visitor.*;

public class IdentifierType extends Type {
    public String s;

    public IdentifierType(String as) {
        s=as;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return s;
    }
}