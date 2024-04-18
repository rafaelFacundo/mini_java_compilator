package symbol;

public class Field extends Table {
    private String nome;
    private Symbol snome;
    private String tipo;

    public Field(Symbol snome, String tipo) {
        this.snome = snome;
        this.nome = snome.toString();
        this.tipo = tipo;

        Table.put(snome, tipo);
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Symbol getSNome() {
        return this.snome;
    }
}