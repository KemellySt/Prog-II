import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Kemelly Steisse da Silva
        // 23.1.8111
        // Engenharia da Computação
        
        // Início do Programa
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

            do{
                System.out.println("\nQual equação você deseja criar? \n[1] Primeiro Grau \n[2] Segundo Grau \n[3] Sair");
                System.out.print("--> ");
                opcao = sc.nextInt();

                if(opcao == 1){

                    System.out.println("\nVocê escolheu Primeiro Grau!");
                    System.out.println("\nDigite o valor de a: ");
                    double a = sc.nextDouble();
                    System.out.println("Digite o valor de b: ");
                    double b = sc.nextDouble();
                    System.out.println("Digite o valor de x: ");
                    double x = sc.nextDouble();

                    Equacoes equacoes = new PrimeiroGrau(a, b, x);
                    System.out.println(equacoes.toString());

                }else if(opcao == 2){
                    System.out.println("\nVocê escolheu Segundo Grau!");
                    System.out.println("Digite o valor de a: ");
                    double a = sc.nextDouble();
                    System.out.println("Digite o valor de b: ");
                    double b = sc.nextDouble();
                    System.out.println("Digite o valor de c: ");
                    double c = sc.nextDouble();
                    System.out.println("Digite o valor de x: ");
                    double x = sc.nextDouble();

                    Equacoes equacoes2 = new SegundoGrau(a, b, c, x);
                    System.out.println(equacoes2.toString());
                }
            }while(opcao != 3);

        sc.close();

    }
}
