package agenda;

import java.util.*;

public class principal {
    public static void main(String[] args) {

        UsuarioLogado usuarioLogado = new UsuarioLogado("12345", "Larissa", 3);
        Agenda agenda = new Agenda();
        Endereco endereco = new Endereco("Av ABC", 345, "9022222");

        Usuario contato1 = new Usuario(UUID.randomUUID(), "João", "51 99999-9999", "joao@gmail.com", Categoria.AMIGOS, "Amigo de infância", endereco);
        Usuario contato2 = new Usuario(UUID.randomUUID(), "Maria", "51 88888-8888", "maria@gmail.com", Categoria.FAMILIA, "Prima", endereco);
        Usuario contato3 = new Usuario(UUID.randomUUID(), "Pedro", "51 77777-7777", "pedro@gmail.com", Categoria.TRABALHO, "Colega de trabalho", endereco);
        Usuario contato4 = new Usuario(UUID.randomUUID(), "Ana", "51 66666-6666", "ana@gmail.com", Categoria.AMIGOS, "Vizinha", endereco);

        agenda.adicionarContato(usuarioLogado.getId(), contato1, usuarioLogado);
        agenda.adicionarContato(usuarioLogado.getId(), contato2, usuarioLogado);
        agenda.adicionarContato(usuarioLogado.getId(), contato3, usuarioLogado);
        agenda.adicionarContato(usuarioLogado.getId(), contato4, usuarioLogado);

        List<Usuario> contatos = agenda.listarContatos(usuarioLogado.getId());
        System.out.println("Contatos cadastrados:");
        for (Usuario contato : contatos) {
            System.out.println(contato);
        }

    }

}
