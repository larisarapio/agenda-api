package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Agenda {
    private Map<String, List<Usuario>> contatosPorUsuario;

    public Agenda() {
        this.contatosPorUsuario = new HashMap<>();
    }

    public void adicionarContato(String usuarioId, Usuario contato, UsuarioLogado usuarioLogado) {

        contatosPorUsuario.putIfAbsent(usuarioId, new ArrayList<>());

        List<Usuario> contatosDoUsuario = contatosPorUsuario.get(usuarioId);
        if (contatosDoUsuario.size() >= usuarioLogado.getLimiteDeContatos()) {
            System.out.printf("Erro: Limite de %d contatos atingido para o usuário %s.%n",
                    usuarioLogado.getLimiteDeContatos(), usuarioLogado.getNome());
            return;
        }

        if (verificaNomeDuplicado(contato.getNome(), contato.getCategoria(), contatosDoUsuario)) {
            System.out.println("Erro: Já existe um contato com o mesmo nome e categoria.");
        } else {
            contatosDoUsuario.add(contato);
            System.out.println("Contato adicionado: " + contato.getNome());
        }
    }

    public boolean verificaNomeDuplicado(String nome, Categoria categoria, List<Usuario> contatosDoUsuario) {
        for (Usuario contato : contatosDoUsuario) {
            if (contato.getNome().equalsIgnoreCase(nome) && contato.getCategoria() == categoria) {
                return true;
            }
        }
        return false;
    }

    public List<Usuario> listarContatos(String usuarioId) {
        return contatosPorUsuario.getOrDefault(usuarioId, new ArrayList<>());
    }

    public void removerContato(String usuarioId, Usuario contato) {
        List<Usuario> contatosDoUsuario = contatosPorUsuario.get(usuarioId);
        if (contatosDoUsuario != null) {
            contatosDoUsuario.remove(contato);
        }
    }

}
