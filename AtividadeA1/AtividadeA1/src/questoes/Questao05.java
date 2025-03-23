package questoes;

public class Questao05 extends BaseExecutarQuestoes{
    private double quantidadeMorangos;
    private double quantidadeMacas;
    public double precoKgMorando;
    public double precoKgMaca;

    public double getQuantidadeMorangos() {
        return quantidadeMorangos;
    }

    public void setQuantidadeMorangos(double quantidadeMorangos) {
        this.quantidadeMorangos = quantidadeMorangos;
    }

    public double getQuantidadeMacas() {
        return quantidadeMacas;
    }

    public void setQuantidadeMacas(double quantidadeMacas) {
        this.quantidadeMacas = quantidadeMacas;
    }

    public Questao05(double quantidadeMorangos, double quantidadeMacas) {
        this.quantidadeMorangos = quantidadeMorangos;
        this.quantidadeMacas = quantidadeMacas;
    }

    public void definePrecoDoKg(){
        if (this.quantidadeMorangos <= 5) {
            this.precoKgMorando = 7.5;
        }
        else
        {
            this.precoKgMorando = 5.3;
        }
    
        if (this.quantidadeMacas <= 5) {
            this.precoKgMaca = 3.5;
        }
        else
        {
            this.precoKgMaca = 2.8;
        }
    }

    public void verificarValorASerPago(){
        definePrecoDoKg();
        double valorTotal, pesoTotal;
        pesoTotal = this.quantidadeMorangos + this.quantidadeMacas;
        valorTotal = (this.quantidadeMorangos * this.precoKgMorando) + (this.quantidadeMacas * this.precoKgMaca);

        if (valorTotal > 19.00 && pesoTotal < 5) {
            valorTotal *= 0.92;
        }

        System.out.println("O valor total da compra é: " + valorTotal);
    }

    @Override
    public void executar(){
        verificarValorASerPago();
    }
    
}
