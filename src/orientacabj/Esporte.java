package orientacabj;

class Esporte implements Competicao {
    String nome;
    boolean precisaDeBola;
    int numeroDeJogadores;
    String tipo; // esportes radicais ou olímpicos
    boolean eIndividual;

    public Esporte(String nome, boolean precisaDeBola, int numeroDeJogadores, String tipo, boolean eIndividual) {
        if (numeroDeJogadores <= 0) {
            throw new IllegalArgumentException("O número de jogadores deve ser maior que zero.");
        }

        this.nome = nome;
        this.precisaDeBola = precisaDeBola;
        this.numeroDeJogadores = numeroDeJogadores;
        this.tipo = tipo;
        this.eIndividual = eIndividual;
    }

    public void apresentarEsporte() {
        System.out.println("orientacabj.Esporte: " + this.nome + "\n" +
                "Precisa de bola? " + this.precisaDeBola + "\n" +
                "Precisa de: " + this.numeroDeJogadores + " jogador(es)!\n" +
                "Tipo: " + this.tipo + "\n" +
                "Individual? " + this.eIndividual);
    }

    @Override
    public void iniciarCompeticao() {
        System.out.println("A competição começou!");

    }

    @Override
    public void terminarCompeticao() {
        System.out.println("A competição terminou!");
    }
}

