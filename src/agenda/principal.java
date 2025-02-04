package agenda;

import java.util.*;

public class principal {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Av ABC", 345, "9022222");

        Usuario usuario = new Usuario(
                UUID.randomUUID(),
                "Larissa",
                "51 995900966",
                "larissa@gmail.com",
                Categoria.AMIGOS,
                "nada a declarar",
                endereco
        );

        Usuario usuario1 = new Usuario(
                UUID.randomUUID(),
                "larissa",
                "51 995900966",
                "larissa@gmail.com",
                Categoria.AMIGOS,
                "nada a declarar",
                endereco
        );


        Agenda novoUsuario = new Agenda();
        novoUsuario.adicinarContato(usuario);
        novoUsuario.adicinarContato(usuario1);
        novoUsuario.listarContatos();
        novoUsuario.buscarContato("larissa", Categoria.AMIGOS);


        /*
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




        List<String> novaLista = new ArrayList<>();
        novaLista.add("Item 1");
        novaLista.add("Item 2");
        novaLista.add("Item 3");
        novaLista.add("Item 3");

        novaLista.addFirst("Item 5");
        novaLista.addLast("Item 6");
        System.out.printf(String.valueOf(novaLista));

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

        */


    }

}
