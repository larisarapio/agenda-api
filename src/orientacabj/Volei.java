package orientacabj;

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
        try {
            if (this.numeroDeJogadores <= 0) {
                throw new IllegalStateException("Número de jogadores inválido para definir o estilo do jogo.");
            }
            if (this.numeroDeJogadores == 2) {
                System.out.println("Vão jogar vôlei de areia");
            } else if (this.numeroDeJogadores == 6){
                System.out.println("Vão jogar vôlei de quadra");
            } else {
                System.out.println("Esse número de jogadores não existe em nenhuma das modalidades do vôlei");
            }
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
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
