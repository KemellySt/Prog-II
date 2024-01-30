public class Tanque{

    private int capacidade = 50;
    private int Qcombustivel;

    public Tanque(int Qcombustivel){
        if(Qcombustivel > capacidade){
            System.out.println("Quantidade de combustivel maior que a capacidade do tanque");   
        }else{
            this.Qcombustivel = Qcombustivel;
        }
    }

    
    public int getCapacidade() {
        return capacidade;
    }

    public int getCombustivel() {
        return Qcombustivel;
    }
    public void setCombustivel(int Qcombustivel) {
        this.Qcombustivel = Qcombustivel;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void abastecer(int Qcombustivel){
        if(Qcombustivel > capacidade){
            System.out.println("Quantidade de combustivel maior que a capacidade do tanque");   
        }else{
            this.Qcombustivel = Qcombustivel;
        }
    }
}