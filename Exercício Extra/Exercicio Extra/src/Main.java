public class Main {
    public static void main(String[] args) throws Exception {
    // Kemelly Steisse da Silva
    // Engenharia da Computação

    // Exercicio Extra
    // Estágio inicial do veiculo

    Motor m = new Motor(71, 12);
    Pneu pD = new Pneu(27);
    Pneu pD2 = new Pneu(27);
    Pneu pT = new Pneu(23);
    Pneu pT2 = new Pneu(23);
    Tanque t = new Tanque(0);
    
    Veiculo v = new Veiculo(m, pD, pD2, pT, pT2, t);

    // Abastecer com 30 litros
    v.getTanque().abastecer(30);
    
    // Exibindo os valores iniciais
    System.out.println("\nValores iniciais:" + "\n");
    System.out.println("Motor -->  Potencia: " + v.getMotor().getPotencia() + ", Taxa de Combustível: " + v.getMotor().getTaxaC());
    System.out.println("Pneu dianteiro direito: " + v.getPneuD().getPressao());
    System.out.println("Pneu dianteiro esquerdo: " + v.getPneuD2().getPressao());
    System.out.println("Pneu traseiro direito: " + v.getPneuT().getPressao());
    System.out.println("Pneu traseiro esquerdo: " + v.getPneuT2().getPressao());
    System.out.println("Tanque: " + v.getTanque().getCombustivel());

    // Calibrando os pneus
    v.getPneuD().Calibrar(30);

    // Andar 300km
    v.getMotor().AvancarKm(v.getTanque(), 300);

    // Reduzir a pressão dos pneus trazeiros para 17 lbs

    v.getPneuT().Calibrar(17);
    v.getPneuT2().Calibrar(17);

    // Exibir os valores finais: após percorrer 300km

    System.out.println("\nValores finais após percorrer 300km:" + "\n");
    System.out.println("Motor -->  Potencia: " + v.getMotor().getPotencia() + ", Taxa de Combustível: " + v.getMotor().getTaxaC());
    System.out.println("Pneu dianteiro direito: " + v.getPneuD().getPressao());
    System.out.println("Pneu dianteiro esquerdo: " + v.getPneuD2().getPressao());
    System.out.println("Pneu traseiro direito: " + v.getPneuT().getPressao());
    System.out.println("Pneu traseiro esquerdo: " + v.getPneuT2().getPressao());
    System.out.println("Tanque: " + v.getTanque().getCombustivel());


    }
}
