package agenda;

public class principal {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
                                        "Larissa",
                                        "51 - 995900966",
                                        "larissa@gmail.com",
                                        Categoria.FAMILIA,
                                        "Nada a declarar");
        System.out.println(usuario1);
    }

}
