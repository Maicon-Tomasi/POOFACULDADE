package fakeDb;

import java.util.ArrayList;

public abstract class BaseFakeDb<TDominio>{
    protected ArrayList<TDominio> instacia;

    public ArrayList<TDominio> getInstacia() {
        if(this.instacia == null){
            this.instacia = new ArrayList<>();
        }

        return this.instacia;
    }

    public BaseFakeDb(){
        this.instacia = new ArrayList<>();
        this.preencherDados();
    }
    
    protected abstract void preencherDados();

}
