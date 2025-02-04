package agenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class UsuarioEmergencial extends Usuario {
    private String servicoEmergencial;

    public UsuarioEmergencial(UUID uuid, String nome, String telefone, String email, Categoria categoria, String notas, Endereco endereco) {
        super(uuid, nome, telefone, email, categoria, notas, endereco);
    }


    public String getServicoEmergencial() {
        return servicoEmergencial;
    }

    public void setServicoEmergencial(String servicoEmergencial) {
        this.servicoEmergencial = servicoEmergencial;
    }

    public void momentoLigacao() {
        LocalDateTime horario = LocalDateTime.now();
        DateTimeFormatter formando = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatoData = horario.format(formando);
        System.out.println(formatoData);
    }

    /*
    @Override
    public String getTipoUsuario() {
        return "Usuário Emergencial: " + servicoEmergencial;
    }

    @Override
    public void executarAcao() {
        System.out.println("Atendendo chamado para " + servicoEmergencial);
    }

     */
}
