package Tree;

public class BINOP extends Exp {
    Exp e1, e2;
    int operador;
    public final static int PLUS = 1, MINUS = 2, MUL = 3, DIV = 4, AND = 5, OR = 6, XOR = 7, LSHIFT = 8, RSHIFT = 9, ARSHIFT = 10;

    public BINOP(int operador, Exp e1, Exp e2) {
        this.operador = operador;
        this.e1 = e1;
        this.e2 = e2;        
    }

    public ExpList kids() {
        return new ExpList(e1, new ExpList(e2, null));
    };
    public Exp build(ExpList kids) {
        return new BINOP(operador, kids.head, kids.tail.head);
    };


}
