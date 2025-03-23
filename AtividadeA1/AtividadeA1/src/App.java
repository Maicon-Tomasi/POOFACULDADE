import java.time.LocalDateTime;
import java.util.Scanner;

import questoes.Questao01;
import questoes.Questao02;
import questoes.Questao03;
import questoes.Questao04;
import questoes.Questao05;
import questoes.Questao06;
import questoes.Questao07;
import questoes.Questao08;
import questoes.Questao09;
import questoes.Questao10;
import questoes.objquestao2.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        double temperatura;
        double morangos, macas;
        int horaInicio,horaFim, minutoFim, minutoInicio;
        int alunos, alunas;
        double gastoTotalCliente;
        double valorcarro;
        double salarioMinimo, salarioFuncionario, taxaNormal;
        int numDeDependentes;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("------------------- Questão 01 -------------------");
        Questao01 questao01 = new Questao01(num1, num2);
        questao01.executar();
        System.out.println("--------------------------------------------------");


        System.out.println("------------------- Questão 02 -------------------");
        Retangulo retagulo1 = new Retangulo(15, 5);
        Retangulo retagulo2 = new Retangulo(10, 5);
        Questao02 questao02 = new Questao02(retagulo1.getArea(), retagulo2.getArea());
        questao02.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 03 -------------------");
        System.out.println("Digite uma temperatura em celsius");
        temperatura = scanner.nextDouble();
        Questao03 questao03 = new Questao03(temperatura);
        questao03.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 04 -------------------");
        System.out.println("Digite o número de alunos da sala; ");
        alunos = scanner.nextInt();
        System.out.println("Digite o número de alunas da sala; ");
        alunas = scanner.nextInt();
        Questao04 questao04 = new Questao04(alunos, alunas);
        questao04.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 05 -------------------");
        System.out.println("Digite quantos kg de morango serão comprados: ");
        morangos = scanner.nextDouble();
        System.out.println("Digite quantos kg de maçã serão comprados: ");
        macas = scanner.nextDouble();
        Questao05 questao05 = new Questao05(morangos, macas);
        questao05.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 06 -------------------");
        System.out.println("Digite a hora de inicio: ");
        horaInicio = scanner.nextInt();
        System.out.println("Digite o minuto de inicio: ");
        minutoInicio = scanner.nextInt();
        System.out.println("Digite hora de finalização: ");
        horaFim = scanner.nextInt();
        System.out.println("Digite o minuto de finalizacao: ");
        minutoFim = scanner.nextInt();
        Questao06 questao06 = new Questao06(horaInicio, horaFim, minutoInicio, minutoFim);
        questao06.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 07 -------------------");
        System.out.println("Digite o valor da compra do cliente: ");
        gastoTotalCliente = scanner.nextDouble();
        Questao07 questao07 = new Questao07(gastoTotalCliente);
        questao07.executar();
        System.out.println("--------------------------------------------------");

        System.out.println("------------------- Questão 08 -------------------");
        System.out.println("Digite o valor do carro: ");
        valorcarro = scanner.nextDouble(); 
        Questao08 questao08 = new Questao08(valorcarro);
        questao08.executar();
        System.out.println("--------------------------------------------------");
        
        System.out.println("------------------- Questão 09 -------------------");
        Questao09 questao09 = new Questao09();
        questao09.executar();
        System.out.println("--------------------------------------------------");
        
        System.out.println("------------------- Questão 10 -------------------");
        System.out.println("Qual o salario Minimo: ");
        salarioMinimo = scanner.nextDouble();
        System.out.println("Qual o numero de dependentes?");
        numDeDependentes = scanner.nextInt();
        System.out.println("Qual o salario do funcionario: ");
        salarioFuncionario = scanner.nextDouble();
        System.out.println("Qual a taxa normal: ");
        taxaNormal = scanner.nextDouble();
        Questao10 questao10 = new Questao10(salarioMinimo, numDeDependentes, salarioFuncionario, taxaNormal);
        questao10.setTaxaAdicional(0.04);
        questao10.executar();
        System.out.println("--------------------------------------------------");
    }
}
