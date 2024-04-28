package Tree;

public class ExpList {
    Exp head;
    ExpList tail;

    public ExpList(Exp h,ExpList t){
        head = h;
        tail = t;
    }

    void add(Exp n){
        if(tail == null){
            tail = new ExpList(n, null);
        }else{
            tail.add(n);
        }
    }
}
