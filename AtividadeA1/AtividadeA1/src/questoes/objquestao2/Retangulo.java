package questoes.objquestao2;

public class Retangulo {
    private int base;
    private int altura;
    private double area;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double getArea() {
        return area;
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        calculaArea();
    }

    public void calculaArea(){
        this.area = (this.base * this.altura);
    }

    
}
