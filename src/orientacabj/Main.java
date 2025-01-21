package orientacabj;

public class Main {
    public static void main(String[] args) {
        Esporte esporte1 = new Esporte("Corrida",
                                            false,
                                            1,
                                            "olímpico",
                                            true);
        //esporte1.apresentarEsporte();

        Esporte esporte2 = new Volei("Vôlei",
                                    true,
                                    2,
                                    "radical",
                                    false);
        esporte2.apresentarEsporte();

        if (esporte2 instanceof Volei) {
            ((Volei) esporte2).atacar();
        } else {
            System.out.println("O objeto esporte2 não é do tipo orientacabj.Volei.");
        }


        Volei volei = new Volei("Vôlei",
                                true,
                                2,
                                "radical",
                                false);

        volei.estiloJogo();
        volei.iniciarCompeticao();
        volei.atacar();
        volei.passarBola();

        Esporte esporte = null;

        if (esporte != null) {
            esporte.iniciarCompeticao();
        } else {
            System.out.println("O objeto esporte não foi inicializado.");
        }


        try {
            Esporte esporte3 = new Esporte("Corrida", false, -1, "olímpico", true);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar esporte: " + e.getMessage());
        }


    }
}