package Syntaxtree;

import java.util.Vector;

import Syntaxtree.visitor.*;

public class FormalList {
    private Vector list;

    public FormalList() {
        list = new Vector();
    }

    public void addElement(Formal n) {
        list.addElement(n);
    }

    public Formal elementAt(int i)  {
        return (Formal)list.elementAt(i);
    }

    public int size() {
        return list.size();
    }
}
