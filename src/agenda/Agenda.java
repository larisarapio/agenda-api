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
        System.out.println("Contato adicionado: " + contato.getNome());
        contatos.add(contato);

    }

    public void removerContato(Usuario contato) {
        contatos.remove(contato);

    }

    public void editarContato(Usuario contato, String novoNome, String novoTelefone, String novoEmail) {
        if (contatos.contains(contato)) {
            contato.setNome(novoNome);
            contato.setTelefone(novoTelefone);
            contato.setEmail(novoEmail);
            System.out.printf("Contato atualizado: %s\n", contato.getNome());
        } else {
            System.out.println("Contato não encontrado na lista.");
        }
    }


    public List<Usuario> listarContatos() {
        System.out.printf("Listando todas os contatos: \n");
        for (Usuario contato : contatos) {
            System.out.println(contato);
        }
        return contatos;

    }
}
