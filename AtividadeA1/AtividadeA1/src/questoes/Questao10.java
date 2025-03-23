 package questoes;

public class Questao10 extends BaseExecutarQuestoes{
    private double salarioMinimo;
    private int numDeDependentes;
    private double taxaNormal;
    private double salarioFuncionario;
    private double imposto;
    private double taxaAdicional;

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getNumDeDependentes() {
        return numDeDependentes;
    }

    public void setNumDeDependentes(int numDeDependentes) {
        this.numDeDependentes = numDeDependentes;
    }

    public double getTaxaNormal() {
        return taxaNormal;
    }

    public void setTaxaNormal(double taxaNormal) {
        this.taxaNormal = taxaNormal;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    public Questao10(double salarioMinimo, int numDeDependentes, double salarioFuncionario, double taxaNormal) {
        this.salarioMinimo = salarioMinimo;
        this.numDeDependentes = numDeDependentes;
        this.salarioFuncionario = salarioFuncionario;
        this.taxaNormal = taxaNormal;
    }

    public void calculaImposto(){
        if (this.salarioFuncionario > this.salarioMinimo * 12) {
            this.imposto = this.salarioFuncionario * 0.20;
            calculaImpostoComTaxaAdicionaleNormal();
            System.out.println("O valor do imposto atual é: " + this.imposto);
        }
        else if (this.salarioFuncionario > this.salarioMinimo * 5) {
            this.imposto = this.salarioFuncionario * 0.08;
            calculaImpostoComTaxaAdicionaleNormal();
            System.out.println("O valor do imposto atual é: " + this.imposto);
        }
        else{
            System.out.println("Você não precisa pagar imposto de renda");
        }
    }

    public void calculaImpostoComTaxaAdicionaleNormal(){
        this.imposto = this.imposto +(this.imposto * this.taxaAdicional);
        this.imposto = Math.max(0, this.imposto - this.taxaNormal);;
    }

    @Override
    public void executar() {
        calculaImposto();
    }

    

}
