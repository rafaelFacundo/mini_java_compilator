package Tree;

import Assem.InstrList;
import Mips.Codegen;

abstract public class Stm {	
    abstract public ExpList kids();
    abstract public Stm build(ExpList kids);

    public InstrList accept(Codegen cg) {
        return cg.codegen(this);
    };
}