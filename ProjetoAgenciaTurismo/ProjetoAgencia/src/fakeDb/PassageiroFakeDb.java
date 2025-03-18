package fakeDb;

import java.time.LocalDate;

import dominio.pessoa.Passageiro;

public class PassageiroFakeDb extends BaseFakeDb<Passageiro>{

    @Override
    protected void preencherDados() {
        this.instacia.add(new Passageiro(0, LocalDate.now(), null, "Maicon", "66996989912", "maiconwstomasi@gmail.com","12345678900" , "123"));
        this.instacia.add(new Passageiro(1, LocalDate.now(), null, "Maicon", "66996989912", "maiconwstomasi@gmail.com","12345678900" , "123"));
        this.instacia.add(new Passageiro(2, LocalDate.now(), null, "Maicon", "66996989912", "maiconwstomasi@gmail.com","12345678900" , "123"));
        this.instacia.add(new Passageiro(3, LocalDate.now(), null, "Maicon", "66996989912", "maiconwstomasi@gmail.com","12345678900" , "123"));
        this.instacia.add(new Passageiro(4, LocalDate.now(), null, "Maicon", "66996989912", "maiconwstomasi@gmail.com","12345678900" , "123"));
    }
    
    public PassageiroFakeDb(){
        super();
    }

}
