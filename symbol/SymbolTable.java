package symbol;

import java.util.ArrayList;

public class SymbolTable extends Table {

    private String nome; // declarar nome da variavel como simbolo ou string?
    private Symbol snome;

    // lista de simbolo -> string
    // simbolo sendo o id do atributo e string o retorno dele (representacao recomendada pelo livro)
    private ArrayList<Field> atributos;

    // lista de simbolo -> string
    // simbolo sendo o id do metodo e string o retorno dele
    private ArrayList<MethodTable> metodos;

    public ArrayList<String> mainArgs;

    public SymbolTable(String nome, SymbolTable pai) {
        this.nome = nome;
        snome = Symbol.symbol(nome);
        atributos = new ArrayList<Field>();
        metodos = new ArrayList<MethodTable>();
        mainArgs = new ArrayList<String>();

        Table.put(snome, nome);
    }

    public boolean addAtb(String id, String t) {
        for (int i = 0; i < atributos.size(); ++i) {
            if (atributos.get(i).getSNome().toString().equals(id)) {
                System.out.println("Classe " + getNome() + " ja tem o atributo " + id + " " + t + ".");
                return false;
            }
        }

        atributos.add(new Field(Symbol.symbol(id), t));
        return true;
    }

    public boolean addAtb(Field atr) {
        for (Field atr2 : getAtributos()) {
            if (atr2.getNome().equals(atr.getNome())) {
                System.out.println("Classe " + getNome() + " ja tem o atributo " + atr2.getNome() + " " + atr2.getTipo() + ".");
                return false;
            }
        }

        atributos.add(atr);
        return true;
    }

    public Field getInAtb(String id) {
        for (Field atr2 : getAtributos()) {
            if (atr2.getNome().equals(id)) {
                return atr2;
            }
        }
        return null;
    }

    public boolean addMtd(String id, String t) {
        for (int i = 0; i < metodos.size(); ++i) {
            if (metodos.get(i).getSNome().toString().equals(id)) {
                System.out.println("Classe " + getNome() + " ja tem o metodo " + id + " " + t + ".");
                return false;
            }
        }

        metodos.add(new MethodTable(Symbol.symbol(id), t));
        return true;
    }

    public boolean addMtd(MethodTable mtd) {
        for (MethodTable mtd2 : getMetodos()) {
            if (mtd2.getNome().equals(mtd.getNome())) {
                System.out.println("Classe " + getNome() + " ja tem o metodo " + mtd2.getNome() + " " + mtd2.getTipo() + ".");
                return false;
            }
        }

        metodos.add(mtd);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Field> getAtributos() {
        return atributos;
    }

    public ArrayList<MethodTable> getMetodos() {
        return metodos;
    }

    public boolean containsInMethods(String id) {
        for (MethodTable mt : getMetodos()) {
            if (mt.getNome().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public MethodTable getInMethods(String id) {
        for (MethodTable mt : getMetodos()) {
            if (mt.getNome().equals(id)) {
                return mt;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "nome='" + nome + '\'' +
                ", snome=" + snome +
                ", atributos=" + atributos +
                ", metodos=" + metodos +
                ", mainArgs=" + mainArgs +
                '}';
    }
}
