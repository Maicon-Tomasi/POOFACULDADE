package questoes;

import java.util.Scanner;

public class Questao07 extends BaseExecutarQuestoes{
    private double gastoCliente;
    private double valorTotal;

    public double getGastoCliente() {
        return gastoCliente;
    }

    public void setGastoCliente(double gastoCliente) {
        this.gastoCliente = gastoCliente;
    }

    public Questao07(double gastoCliente) {
        this.gastoCliente = gastoCliente;
    }

    public void exibeOpcoes(){
        int opt;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a forma de pagamento");
        System.out.println("Digite 1 para pagar a vista com 10% de desconto");
        System.out.println("Digite 2 para pagar em duas vezes (preço da etiqueta)");
        System.out.println("Digite 3 para pagar de 3 até 10 vezes com 3% de juros ao mês.");
        opt = scanner.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Opção escolhida: Pagar a vista com 10% de desconto");
                calculaValorAvista();
                break;
            case 2:
                System.out.println("Opção escolhida: Pagar em duas vezes");
                pagarEmDuasVezes();
                break;
            case 3:
                int qtdParcelas;
                if (this.gastoCliente < 100) {
                    System.out.println("Opção escolhida: Indisponivel, valor da compra deve ser maior que 100 reais");
                    return; 
                }
                System.out.println("Opção escolhida: Pagar de 3 até 10 vezes com 3% de juros ao mês.");
                System.out.println("Deseja Parcelar em quantas vezes?");
                qtdParcelas = scanner.nextInt();
                pagarComJuros(qtdParcelas);
                break;
            default:
                break;
        }
    }

    public void calculaValorAvista(){
        this.valorTotal = this.gastoCliente * 0.90;

        System.out.println("Valor a ser pago é de: " + this.valorTotal);
    }

    public void pagarEmDuasVezes(){
        double parcela;
        this.valorTotal = this.gastoCliente;
        parcela = this.valorTotal / 2;

        System.out.println("Valor a ser pago é de: " + this.valorTotal);
        System.out.println("1° parcela: " + parcela);
        System.out.println("2° parcela: " + parcela);
    }

    public void pagarComJuros(int qtdParcelas) {
        this.valorTotal = this.gastoCliente / qtdParcelas;
    
        for (int i = 0; i < qtdParcelas; i++) {
            this.valorTotal *= (1 + (3.0 / 100)); 
            System.out.println(String.format("Valor da %d° parcela = R$%.2f", (i + 1), this.valorTotal));
        }
        System.out.println(String.format("Valor Total: R$%.2f", this.valorTotal * qtdParcelas));
    } 

    @Override
    public void executar(){
        exibeOpcoes();
    }
}
