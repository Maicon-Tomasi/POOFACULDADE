package questoes;

import java.util.Scanner;

public class Questao09 extends BaseExecutarQuestoes{
    private double valorPorMetroCubico;
    private double taxa;
    private double consumo;
    private double valorConta;

    public double getValorPorMetroCubico() {
        return valorPorMetroCubico;
    }

    public void setValorPorMetroCubico(double valorPorMetroCubico) {
        this.valorPorMetroCubico = valorPorMetroCubico;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }


    public Questao09() {
    }

    public void selecionaTipoConsumo(){
        int opt;   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de consumo: ");
        System.out.println("Digite 1 para residencial ");
        System.out.println("Digite 2 para comercial ");
        System.out.println("Digite 3 para industrial ");

        opt = scanner.nextInt();

        switch (opt) {
            case 1:
                this.taxa = 5.00;
                this.valorPorMetroCubico = 0.05;
                System.out.println("Qual foi o consumo? (Valor em m³)");
                this.consumo = scanner.nextDouble();
                this.valorConta = calculoConta();
                System.out.println("Valor da conta: R$" + this.valorConta);
                break;
            case 2:
                this.taxa = 500.00;
                this.valorPorMetroCubico = 0.25;
                System.out.println("Qual foi o consumo? (Valor em m³)");
                this.consumo = scanner.nextDouble();
                if(this.consumo > 80){
                    this.valorConta = calculoConta();
                }
                else
                {
                    this.valorConta = this.taxa;
                }
                System.out.println("Valor da conta: R$" + this.valorConta);
                break;
            case 3:
                this.taxa = 800.00;
                this.valorPorMetroCubico = 0.04;
                System.out.println("Qual foi o consumo? (Valor em m³)");
                this.consumo = scanner.nextDouble();
                if(this.consumo > 100){
                    this.valorConta = calculoConta();
                }
                else
                {
                    this.valorConta = this.taxa;
                }
                System.out.println("Valor da conta: R$" + this.valorConta);
                break;
            default:
                System.out.println("Opção indisponível");
        }   
    }

    public double calculoConta(){
        System.out.println(this.taxa + " + (" + this.consumo + "*" + this.valorPorMetroCubico + ")");
        return this.taxa + (this.consumo * this.valorPorMetroCubico);
    }

    @Override
    public void executar() {
        selecionaTipoConsumo();
    }
}
