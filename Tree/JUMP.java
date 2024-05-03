package Tree;

import Temp.Label;
import Temp.LabelList;

public class JUMP extends Stm {
    public Exp e;
    public LabelList labels;

    public JUMP(Exp e, LabelList labels) {
        this.e = e;
        this.labels = labels;
    }

    public JUMP(Label l) {
        this(new NAME(l), new LabelList(l, null));
    }

    public ExpList kids() {
        return new ExpList(e, null);
    }

    public Stm build(ExpList kids) {
        return new JUMP(kids.head, this.labels);
    };

}
