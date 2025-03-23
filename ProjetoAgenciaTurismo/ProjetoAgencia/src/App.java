import java.time.LocalDate;
import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import repositorio.PassageiroRepo;

public class App {
    public static void main(String[] args) throws Exception {
        
        PassageiroRepo repo = new PassageiroRepo();

        ArrayList<Passageiro> lista = repo.read();

        for (Passageiro passageiro : lista) {
            System.out.println("===================================");
            System.out.println("Código: " + passageiro.getCodigo());
            System.out.println("Nome: " + passageiro.getNome());
            System.out.println("Email: " + passageiro.getTelefone());
            System.out.println("===================================");
        }

        Passageiro teste = new Passageiro(1000, LocalDate.now(), null, "teste create", null, "teste@gmai.com", null, null);
        Passageiro create = repo.create(teste);

        System.err.println("Passageiro Criado");
        System.err.println("Codigo: " + create.getCodigo());
        System.err.println("Nome: " + create.getNome());
        System.err.println("Email: " + create.getEmail());


        ArrayList<Passageiro> lista2 = repo.read();

        for (Passageiro passageiro : lista2) {
            System.out.println("===================================");
            System.out.println("Código: " + passageiro.getCodigo());
            System.out.println("Nome: " + passageiro.getNome());
            System.out.println("Email: " + passageiro.getEmail());
            System.out.println("===================================");
        }
    }
}
