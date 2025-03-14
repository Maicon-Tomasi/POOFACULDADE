package dominio;

import java.time.LocalDate;

public abstract class BaseParametro extends BaseIdentificador {
    protected LocalDate dataDeIclusao;
    protected LocalDate dataDeAlteracao;

    public LocalDate getDataDeIclusao() {
        return dataDeIclusao;
    }

    public void setDataDeIclusao(LocalDate dataDeIclusao) {
        this.dataDeIclusao = dataDeIclusao;
    }

    public LocalDate getDataDeAlteracao() {
        return dataDeAlteracao;
    }

    public void setDataDeAlteracao(LocalDate dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }
 
    public BaseParametro(long codigo, LocalDate dataDeIclusao, LocalDate dataDeAlteracao) {
        super(codigo);
        this.dataDeIclusao = dataDeIclusao;
        this.dataDeAlteracao = dataDeAlteracao;
    }

}
