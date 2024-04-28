package Tree;

public class CONST extends Exp{
    Integer cnst;

    public CONST(Integer c){
        cnst = c;
    }

    public ExpList kids() {
        return null;
    }
    
    public Exp build(ExpList kids) {
        return this;
    }
}
