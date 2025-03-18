package questoes;

import java.util.Scanner;

public class Questao01 extends BaseExecutarQuestoes{
    private Integer num1;
    private Integer num2;
    private Integer maior;
    
    public Integer getNum1() {
        return num1;
    }
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }
    public Integer getNum2() {
        return num2;
    }
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
    public Integer getMaior() {
        return maior;
    }

    public Questao01(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
        realizaComparacao();
    }

    public void realizaComparacao(){
        this.maior = Math.max(this.num1, this.num2);
    }
  
    @Override
    public void executar(){
        System.out.println("O maior número é " + this.maior);
    }

    

}
