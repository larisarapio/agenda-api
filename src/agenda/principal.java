package agenda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class principal {
    public static void main(String[] args) {
        /*
        Endereco enderecoUsuario1 = new Endereco("Av ABC", 2, "52000");
        Endereco enderecoUsuario2 = new Endereco("Av Carlos Gomes", 97, "450");

        Usuario usuario1 = new Usuario(
                                        "Larissa",
                                        "51 - 99999999",
                                        "larissa@gmail.com",
                                        Categoria.FAMILIA,
                                        "Nada a declarar",
                                        enderecoUsuario1);
        System.out.println(usuario1);

        UsuarioEmergencial usuario2 = new UsuarioEmergencial(
                                                        "SAMU",
                                                        "190",
                                                        "samu@gmail.com",
                                                        Categoria.EMERGENCIA,
                                                        "Contato de emergencias",
                                                        enderecoUsuario2);

        System.out.println(usuario2);
        usuario2.setServicoEmergencial("SAMU");
        usuario2.executarAcao();
        usuario2.momentoLigacao();

        Agenda listaUsuarios = new Agenda();
        listaUsuarios.adicinarContato(usuario1);
        listaUsuarios.adicinarContato(usuario2);
        listaUsuarios.listarContatos();

        listaUsuarios.editarContato(usuario2, "POLÍCIA", "51 - 995900967", "larissasa22@gmail.com");
        listaUsuarios.listarContatos();
        listaUsuarios.buscaContato("Larissa s");
        listaUsuarios.removerContato(usuario1);
        listaUsuarios.listarContatos();


         */

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Item 1");
        novaLista.add("Item 2");
        novaLista.add("Item 3");
        novaLista.add("Item 3");

        Set<String> itensUnicos = new HashSet<>();
        boolean hasDuplicado = false;

        for(String item : novaLista) {
            if (!itensUnicos.add(item)) {
                hasDuplicado = true;
                System.out.printf("Item %s ja existe\n", item);
            }
        }

        if (!hasDuplicado) {
            System.out.println("Não há duplicados na lista.");
        }

    }

}
