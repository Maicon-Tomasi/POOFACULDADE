package dominio.pessoa.juridica;

import java.time.LocalDate;

public class AgenteDeTurismo extends BasePessoaJuridica{
    private String registroCNT;

    public String getRegistroCNT() {
        return registroCNT;
    }

    public void setRegistroCNT(String registroCNT) {
        this.registroCNT = registroCNT;
    }

    public AgenteDeTurismo(long codigo, LocalDate dataDeIclusao, LocalDate dataDeAlteracao, String nome,
            String telefone, String email, String cnpj, String inscricaoEstadual, LocalDate dataInicioVinculo,
            LocalDate dataFinalVinculo, String registroCNT) {
        super(codigo, dataDeIclusao, dataDeAlteracao, nome, telefone, email, cnpj, inscricaoEstadual, dataInicioVinculo,
                dataFinalVinculo);
        this.registroCNT = registroCNT;
    }

    
}
