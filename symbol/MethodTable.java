package symbol;

import java.util.ArrayList;

public class MethodTable extends Field {

    private ArrayList<Field> parametros;
    private ArrayList<Field> vlocais;

    public MethodTable(Symbol snome, String tipo) {
        super(snome, tipo);
        parametros = new ArrayList<Field>();
        vlocais    = new ArrayList<Field>();

        Table.put(snome, tipo);
    }

    public boolean addParam(String id, String t) {
        for (int i = 0; i < parametros.size(); ++i) {
            if (parametros.get(i).getNome().equals(id)) {
                System.out.println("Erro ao adicionar parametro" + id + " " + t + " no metodo" + getNome() + " " + getTipo() + ".");
                return false;
            }
        }

        parametros.add(new Field(Symbol.symbol(id), t));
        return true;
    }

    public boolean addLocal(String id, String t) {
        for (int i = 0; i < vlocais.size(); ++i) {
            if (vlocais.get(i).getNome().equals(id)) {
                System.out.println("Erro ao adicionar variavel local" + id + " " + t + " no metodo" + getNome() + " " + getTipo() + ".");
                return false;
            }
        }

        vlocais.add(new Field(Symbol.symbol(id), t));
        return true;
    }

    public ArrayList<Field> getParametros() {
        return parametros;
    }

    public ArrayList<Field> getVlocais() {
        return vlocais;
    }

    public boolean containsInParams(String id) {
        for (Field obj : getParametros()) {
            if (obj.getNome().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Field getInParams(String id) {
        for (Field obj : getParametros()) {
            if (obj.getNome().equals(id)) {
                return obj;
            }
        }
        return null;
    }

    public boolean containsInLocals(String id) {
        for (Field obj : getVlocais()) {
            if (obj.getNome().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Field getInLocals(String id) {
        for (Field obj : getVlocais()) {
            if (obj.getNome().equals(id)) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MethodTable{" +
                "parametros=" + parametros +
                ", vlocais=" + vlocais +
                '}';
    }
}