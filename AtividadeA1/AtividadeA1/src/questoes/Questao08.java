package questoes;

import java.util.Scanner;

public class Questao08 extends BaseExecutarQuestoes{
    private double valorCarro;

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public Questao08(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public void configuraCarro(){
        int opt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("O valor do carro original é R$" + this.valorCarro);
        System.out.println("Você deseja que ele tenha ar-condicionado? (+ R$ 1750,00)  | Digite 1 para sim e 0 para não");
        opt = scanner.nextInt();

        if (opt == 1) {
            this.valorCarro += 1750.00;
            System.out.println("O valor do carro atual é R$" + this.valorCarro);
            opt = 0;
        }

        System.out.println("Você deseja que ele tenha pintura metélica? (+ R$ 800,00) | Digite 1 para sim e 0 para não");
        opt = scanner.nextInt();

        if (opt == 1) {
            this.valorCarro += 800.00;
            System.out.println("O valor do carro atual é R$" + this.valorCarro);
            opt = 0;
        }

        System.out.println("Você deseja que ele tenha Vidro elétrico ? (+ R$ 1200,00) | Digite 1 para sim e 0 para não");
        opt = scanner.nextInt();

        if (opt == 1) {
            this.valorCarro += 1200.00;
            System.out.println("O valor do carro atual é R$" + this.valorCarro);
            opt = 0;
        }

        System.out.println("Você deseja que ele tenha Direção Hidráulica ? (+ R$ 2000,00) | Digite 1 para sim e 0 para não");
        opt = scanner.nextInt();

        if (opt == 1) {
            this.valorCarro += 2000.00;
            System.out.println("O valor do carro atual é R$" + this.valorCarro);
            opt = 0;
        }
        
    }

    @Override
    public void executar(){
        configuraCarro();
        System.out.println("Valor final do carro: " + this.valorCarro);
    }

    
}
