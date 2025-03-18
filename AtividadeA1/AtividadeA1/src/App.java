import java.util.Scanner;

import questoes.Questao01;
import questoes.Questao02;
import questoes.objquestao2.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        // int num1, num2;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o primeiro número: ");
        // num1 = scanner.nextInt();
        // System.out.println("Digite o segundo número: ");
        // num2 = scanner.nextInt();

        // System.out.println("------------------- Questão 01 -------------------");
        // Questao01 questao01 = new Questao01(num1, num2);
        // questao01.executar();
        // System.out.println("--------------------------------------------------");


        System.out.println("------------------- Questão 02 -------------------");
        Retangulo retagulo1 = new Retangulo(15, 5);
        Retangulo retagulo2 = new Retangulo(10, 5);
        Questao02 questao02 = new Questao02(retagulo1.getArea(), retagulo2.getArea());
        questao02.executar();
        System.out.println("--------------------------------------------------");


    }
}
