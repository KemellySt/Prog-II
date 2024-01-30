public class Motor{
    
    private int potencia;
    private int taxaC;

    public Motor(int potencia, int taxaC) {
        this.potencia = potencia;
        this.taxaC = taxaC;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getTaxaC() {
        return taxaC;
    }

    public void AvancarKm(Tanque tanque, int qtdKm){

        int combustivelAtualizado = tanque.getCombustivel() - (qtdKm / taxaC);

        tanque.setCombustivel(combustivelAtualizado);

    }
}