package Tree;

public class SEQ extends Stm{
    Stm s1;
    Stm s2;

    public SEQ(Stm s1In, Stm s2In){
        s1 = s1In;
        s2 = s2In;
    }

    public ExpList kids(){
        throw new Error("kids() not applicable to SEQ");
    }
    public Stm build(ExpList kids){
        throw new Error("build() not applicable to SEQ");
    }
}
