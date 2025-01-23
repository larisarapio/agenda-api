package agenda;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Usuario> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void buscaContato(String nome) {
        for (Usuario contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato.getNome());
                return;
            }
        }
        System.out.println("Contato não encontrado.");

    }

    public void adicinarContato(Usuario contato) {
        contatos.add(contato);

    }

    public void removerContato(Usuario contato) {
        contatos.remove(contato);

    }

    public void editarContato(Usuario contato) {
        contatos.set(contatos.indexOf(contato), contato);

    }

    public List<Usuario> listarContatos() {
        return contatos;

    }
}
