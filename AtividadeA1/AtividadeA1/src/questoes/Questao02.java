package questoes;

public class Questao02 extends BaseExecutarQuestoes{
    private double areaRetangulo1;
    private double areaRetangulo2;

    public double getAreaRetangulo1() {
        return areaRetangulo1;
    }

    public void setAreaRetangulo1(double areaRetangulo1) {
        this.areaRetangulo1 = areaRetangulo1;
    }

    public double getAreaRetangulo2() {
        return areaRetangulo2;
    }

    public void setAreaRetangulo2(double areaRetangulo2) {
        this.areaRetangulo2 = areaRetangulo2;
    }

    public Questao02(double areaRetangulo1, double areaRetangulo2)
    {
        this.areaRetangulo1 = areaRetangulo1;
        this.areaRetangulo2 = areaRetangulo2;
    }
    
    public void comparaAreaRetangulo(){
        if(this.areaRetangulo1 > this.areaRetangulo2)
        {
            System.out.println("A área do primeiro retângulo é maior sendo de " + this.areaRetangulo1);
        }
        else if(this.areaRetangulo1 == this.areaRetangulo2)
        {
            System.out.println("Os retângulos possuem a mesma área sendo de " + this.areaRetangulo1);
        }
        else
        {
            System.out.println("A área do segundo retângulo é maior sendo de " + this.areaRetangulo2);
        }
    }

    @Override
    public void executar(){
        comparaAreaRetangulo();
    }

}
