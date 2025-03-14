import Dominio.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro(10, 2010, "Hb20","Vermelho", "Hyundai");
        System.out.println("Código: " + carro1.getCodigo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Fabricante: " + carro1.getFabricante());
        
    }
}
 