package questoes;

public class Questao03 extends BaseExecutarQuestoes{
    private double temperaturaEmCelsius;
    private double temperaturaEmFahrenheit;

    public double getTemperaturaEmCelsius() {
        return temperaturaEmCelsius;
    }

    public void setTemperaturaEmCelsius(double temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
    }

    public double getTemperaturaEmFahrenheit() {
        return temperaturaEmFahrenheit;
    }

    public void setTemperaturaEmFahrenheit(double temperaturaEmFahrenheit) {
        this.temperaturaEmFahrenheit = temperaturaEmFahrenheit;
    }

    public Questao03(double temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
        this.ConverterTemperatura();
    }

    public void ConverterTemperatura(){
        this.temperaturaEmFahrenheit = (this.temperaturaEmCelsius * 1.8) + 32;
    }

    @Override
    public void executar(){
        System.out.println("A temperatura de " + this.temperaturaEmCelsius + "°C convertida para Fahrenheit é " + this.temperaturaEmFahrenheit + "graus Fahrenheit");
    }
    
    
}
