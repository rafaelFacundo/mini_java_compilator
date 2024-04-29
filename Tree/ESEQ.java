package Tree;

public class ESEQ extends Exp {
    Stm stm;
    Exp e;

    public ESEQ(Stm stm, Exp e) {
        this.stm = stm;
        this.e = e;
    }

    public ExpList kids() {
        throw new Error("kids() not applicable to ESEQ");
    };
    public Exp build(ExpList kids) {
        throw new Error("build() not applicable to ESEQ");
    };
}
