package med.voll.api.paciente;

import med.voll.api.endereco.DadosEnderco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEnderco endereco) {
}
