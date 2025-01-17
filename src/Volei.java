class Volei extends Esporte implements EsporteComBola {
    public Volei(String nome, boolean precisaDeBola, int numeroDeJogadores, String tipo, boolean eIndividual) {
        super(nome, precisaDeBola, numeroDeJogadores, tipo, eIndividual);
    }

    @Override
    public void apresentarEsporte() {
        super.apresentarEsporte(); //
        System.out.println("Esse esporte é uma variante do vôlei!");
    }


    public void atacar() {
        System.out.println("Estão atacando");
    }

    public void defender() {
        System.out.println("Estão defendendo");
    }

    public void estiloJogo() {
        if (this.numeroDeJogadores == 2) {
            System.out.println("Vão jogar vôlei de areia");
        } else {
            System.out.println("Vão jogar vôlei de quadra");
        }
    }

    @Override
    public void passarBola() {
        System.out.println("Passando a bola");
    }

    @Override
    public void chutarBola() {
        System.out.println("Errrrrrrrr chutou a bola");
    }
}
