package dominio.pessoa;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    private String documentoPessoal;
    private String numeroDoCartao;

    public String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public Passageiro(long codigo, LocalDate dataDeIclusao, LocalDate dataDeAlteracao, String nome, String telefone,
            String email, String documentoPessoal, String numeroDoCartao) {
        super(codigo, dataDeIclusao, dataDeAlteracao, nome, telefone, email);
        this.documentoPessoal = documentoPessoal;
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public String toString() {
        return "Passageiro [codigo=" + codigo + ", documentoPessoal=" + documentoPessoal + ", dataDeIclusao="
                + dataDeIclusao + ", numeroDoCartao=" + numeroDoCartao + ", nome=" + nome + ", dataDeAlteracao="
                + dataDeAlteracao + ", telefone=" + telefone + ", email=" + email + "]";
    }

   

    
    
}
