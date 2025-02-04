package agenda;

public class UsuarioLogado {
    private String id;
    private String nome;
    private int limiteDeContatos;

    public UsuarioLogado(String id, String nome, int limiteDeContatos) {
        this.id = id;
        this.nome = nome;
        this.limiteDeContatos = limiteDeContatos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimiteDeContatos() {
        return limiteDeContatos;
    }

    public void setLimiteDeContatos(int limiteDeContatos) {
        this.limiteDeContatos = limiteDeContatos;
    }
}
