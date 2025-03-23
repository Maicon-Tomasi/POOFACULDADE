package repositorio;

import java.util.ArrayList;

import fakeDb.BaseFakeDb;

public abstract class BaseRepositorio<TDominio>{
    protected BaseFakeDb<TDominio> baseDeDados;

    public abstract TDominio create(TDominio instancia);
    
    public abstract TDominio read(long codigo);

    public ArrayList<TDominio> read(){
        return this.baseDeDados.getInstacia();
    }
    
    public abstract TDominio update(TDominio instancia);
    
    public abstract TDominio delete(long codigo);
}
