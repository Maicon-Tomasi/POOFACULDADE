package questoes;

public class Questao04 extends BaseExecutarQuestoes{
    private int numDeAlunos;
    private int numDeAlunas;

    public int getNumDeAlunos() {
        return numDeAlunos;
    }

    public void setNumDeAlunos(int numDeAlunos) {
        this.numDeAlunos = numDeAlunos;
    }

    public int getNumDeAlunas() {
        return numDeAlunas;
    }

    public void setNumDeAlunas(int numDeAlunas) {
        this.numDeAlunas = numDeAlunas;
    }

    public Questao04(int numDeAlunos, int numDeAlunas) {
        this.numDeAlunos = numDeAlunos;
        this.numDeAlunas = numDeAlunas;
    }

    private void verificaQuantidade(){
        if(this.numDeAlunos > this.numDeAlunas){
            System.out.println("O numero de alunos é igual a: " + numDeAlunos);
            System.out.println("O numero de alunas é igual a: " + numDeAlunas);
        }
        else if(this.numDeAlunos == this.numDeAlunas)
        {
            System.out.println("O numero de alunos é igual ao número de alunas sendo " + this.numDeAlunas + "alunas e " + this.numDeAlunos + " alunos");
        }
        else
        {
            System.out.println("O numero de alunas é igual a: " + numDeAlunas);
            System.out.println("O numero de alunos é igual a: " + numDeAlunos);
        }
    }

    @Override
    public void executar(){
        this.verificaQuantidade(); 
    }
}
