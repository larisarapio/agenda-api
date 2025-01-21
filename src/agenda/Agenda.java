package agenda;

import java.util.ArrayList;
import java.util.List;

class Agenda extends Usuario{
    private List<Agenda> contatos;

    public Agenda(String nome, String telefone, String email, Categoria categoria, String notas) {
        super(nome, telefone, email, categoria, notas);
    }

    public void buscaContato() {
        contatos = new ArrayList<Agenda>();

    }

    public void adicinarContato(Agenda contato) {
        contatos.add(contato);

    }

    public void removerContato(Agenda contato){
        contatos.remove(contato);

    }

    public void editarContato(Agenda contato){
        contatos.set(contatos.indexOf(contato), contato);

    }

    public List<Agenda> listarContatos() {
        return contatos;

    }
}
