package med.voll.api.paciente;

import jakarta.validation.Valid;
import med.voll.api.endereco.DadosEnderco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEnderco endereco) {
}
