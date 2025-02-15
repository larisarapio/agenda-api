package agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class principal {
    public static void main(String[] args) {

        UsuarioLogado usuarioLogado = new UsuarioLogado("12345", "Larissa", 2);
        usuarioLogado.definindoLimiteContatos(usuarioLogado.limiteDeContatos);

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

        UsuarioLogado usuarioLogado2 = new UsuarioLogado("1122", "Arthur", 2);
        Agenda agenda2 = new Agenda();
        Endereco endereco2 = new Endereco("Av DEF", 678, "9022222");

        Usuario cont1 = new Usuario(UUID.randomUUID(), "Teste1", "51 99999-9999", "joao@gmail.com", Categoria.AMIGOS, "Amigo de infância", endereco2);
        Usuario cont2 = new Usuario(UUID.randomUUID(), "Teste2", "51 88888-8888", "maria@gmail.com", Categoria.FAMILIA, "Prima", endereco2);
        Usuario cont3 = new Usuario(UUID.randomUUID(), "Teste3", "51 77777-7777", "pedro@gmail.com", Categoria.TRABALHO, "Colega de trabalho", endereco2);

        agenda2.adicionarContato(usuarioLogado2.getId(), cont1, usuarioLogado2);
        agenda2.adicionarContato(usuarioLogado2.getId(), cont2, usuarioLogado2);
        agenda2.adicionarContato(usuarioLogado2.getId(), cont3, usuarioLogado2);

        List<Usuario> maisContatos = agenda2.listarContatos(usuarioLogado2.getId());
        System.out.println("Contatos cadastrados:");
        for (Usuario contato : maisContatos) {
            System.out.println(contato);
        }

        System.out.println("EM JSONNNN");

        // Caminho absoluto do arquivo
        File arquivo = new File("D:/Users/lucia/Music/new-pc/agenda-api/src/agenda/usuariosLogados.json");


        // Verificando o caminho absoluto
        System.out.println("Procurando arquivo em: " + arquivo.getAbsolutePath());

        StringBuilder jsonString = new StringBuilder();

        // Verificando se o arquivo existe
        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado!");
            return;
        }

        // Lê o arquivo JSON
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime o conteúdo do arquivo JSON
        System.out.println("Conteúdo do arquivo JSON:");
        System.out.println(jsonString.toString());


    }


}
