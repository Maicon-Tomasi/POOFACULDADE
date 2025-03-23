package questoes;


public class Questao06 extends BaseExecutarQuestoes{
    private int horaInicio;
    private int horaFim;
    private int minutoInicio;
    private int minutoFim;

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public int getMinutoFim() {
        return minutoFim;
    }

    public void setMinutoFim(int minutoFim) {
        this.minutoFim = minutoFim;
    }

    public Questao06(int horaInicio, int horaFim, int minutoInicio, int minutoFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.minutoInicio = minutoInicio;
        this.minutoFim = minutoFim;
    }

    public void calculaDuracao(){
        int inicioTotalMinutos = (this.horaInicio * 60) + this.minutoInicio;
        int terminoTotalMinutos = (this.horaFim * 60 ) + this.minutoFim;

        if (inicioTotalMinutos == terminoTotalMinutos) {
            System.out.println("Duração do jogo: 24 hora(s) e 0 minuto(s)");
            return;
        }

        if (terminoTotalMinutos < inicioTotalMinutos) {
            terminoTotalMinutos += (24 * 60); 
        }

        int duracaoMinutos = terminoTotalMinutos - inicioTotalMinutos;
        int duracaoHoras = duracaoMinutos / 60;
        if (duracaoHoras > 24) {
            System.out.println("A duração maxima é de 24 horas");
            return;
        }
        duracaoMinutos %= 60;
        
        System.out.println("Duração do jogo: " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s)");
    }

    @Override
    public void executar() {
        calculaDuracao();
        
    }

    

    
}
