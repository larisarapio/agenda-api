package agenda;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Usuario> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicinarContato(Usuario contato) {
        if (verificaNomeDuplicado(contato.getNome(), contato.getCategoria())) {
            System.out.println("Erro: Já existe um contato com o mesmo nome e categoria.");
        } else {
            contatos.add(contato);
            System.out.println("Contato adicionado: " + contato.getNome());
        }

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

    public List<Usuario> buscarContato(String nome, Categoria categoria) {

        List<Usuario> contatosEncontrados = new ArrayList<>();

        for (Usuario contato : contatos) {
            if(contato.getCategoria() == categoria) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Contato encontrado: " + contato.getNome());
                    contatosEncontrados.add(contato);
                }
            }
        }

        return  contatosEncontrados;
    }

    public boolean verificaNomeDuplicado(String nome, Categoria categoria) {
        for (Usuario contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }

        return false;
    }

}
