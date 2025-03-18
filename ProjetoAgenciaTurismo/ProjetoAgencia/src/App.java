import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import fakeDb.PassageiroFakeDb;

public class App {
    public static void main(String[] args) throws Exception {
        
        PassageiroFakeDb fakeDb = new PassageiroFakeDb();
        ArrayList<Passageiro> listaDePassageiros;
        listaDePassageiros = fakeDb.getInstacia();
        
        for (Passageiro passageiro : listaDePassageiros) {
            System.out.println("Código: " + passageiro.getCodigo());
            System.out.println("Nome:" + passageiro.getNome());
            System.out.println("email: " + passageiro.getEmail());
            System.out.println("--------------------------- ----");
        }

    }
}
