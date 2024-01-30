public class Pneu{
    
    private int pressao;


    public Pneu(int pressao){
        this.pressao = pressao;
    }

    public int getPressao(){
        return pressao;
    }

    public void Calibrar(int pressao){
        this.pressao = pressao;

    }

}
