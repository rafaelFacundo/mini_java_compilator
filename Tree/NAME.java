package Tree;

import Temp.Label;

public class NAME extends Exp{
    public Label cnst;

    public NAME(Label c){
        cnst = c;
    }

    public ExpList kids() {
        return null;
    }
    
    public Exp build(ExpList kids) {
        return this;
    }
}
