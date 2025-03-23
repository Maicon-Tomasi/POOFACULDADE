package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import fakeDb.PassageiroFakeDb;

public class PassageiroRepo extends BaseRepositorio<Passageiro>{
    private PassageiroFakeDb fakeDb;

    public PassageiroRepo(){
        this.fakeDb = new PassageiroFakeDb();
        this.baseDeDados = this.fakeDb;
    }

    @Override
    public Passageiro create(Passageiro instancia) {
        Passageiro p  = this.baseDeDados.getInstacia().getLast();
        Long chave = p.getCodigo() + 1;
        instancia.setCodigo(chave);
        this.baseDeDados.getInstacia().add(instancia);
        return instancia;
    }

    @Override
    public Passageiro read(long codigo) {
        ArrayList<Passageiro> lista = this.baseDeDados.getInstacia();
        for (Passageiro passageiro : lista) {
            if (passageiro.getCodigo() == codigo) {
                return passageiro;
            }
        }
        return null;
    }

    @Override
    public Passageiro update(Passageiro instancia) {
        Passageiro alterado = this.read(instancia.getCodigo());
        if (alterado != null) {
            alterado.setDataDeAlteracao(LocalDate.now());
            alterado.setDocumentoPessoal(instancia.getDocumentoPessoal());
            alterado.setEmail(instancia.getEmail());
            alterado.setNome(instancia.getNome());
            alterado.setNumeroDoCartao(instancia.getNumeroDoCartao());
            alterado.setTelefone(instancia.getTelefone());

            return alterado;
        }

        return alterado;
    }
   
    @Override
    public Passageiro delete(long codigo) {
        Passageiro deletado = this.read(codigo);
        if (deletado != null) {
            this.baseDeDados.getInstacia().remove(deletado);
            return deletado;
        }

        return deletado;
    }
    
}
