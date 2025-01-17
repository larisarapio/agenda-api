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
        //esporte2.apresentarEsporte();

        Volei volei = new Volei("Vôlei",
                                true,
                                2,
                                "radical",
                                false);

        volei.estiloJogo();
        volei.iniciarCompeticao();
        volei.atacar();
        volei.passarBola();
    }
}