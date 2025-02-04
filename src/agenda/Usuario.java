package agenda;

import java.util.UUID;

class Usuario {
    private UUID uuid;
    private String nome;
    private String telefone;
    private String email;
    private Categoria categoria;
    private String notas;
    private Endereco endereco;

    public Usuario(UUID uuid, String nome, String telefone, String email, Categoria categoria, String notas, Endereco endereco) {
        this.uuid = uuid;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.categoria = categoria;
        this.notas = notas;
        this.endereco = endereco;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Telefone: %s | Email: %s | Categoria: %s | Notas: %s" +
                        " | Endereço: %s ",
                this.nome,
                this.telefone,
                this.email,
                this.categoria,
                this.notas,
                this.endereco
        );
    }

}
