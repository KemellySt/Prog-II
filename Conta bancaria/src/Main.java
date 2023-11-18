import java.util.Scanner;
import Conta.Conta;

public class Main {
    public static void main(String[] args) throws Exception {


        // Programa sobre conta bancaria
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        String nome;
        Conta conta = new Conta();

        System.out.println(
                "=========================================== BEM VINDO AO BANCO NUBANK ===========================================");

        while (escolha != 3) {

            System.out.println("O que deseja fazer? ");
            System.out.println("[1] CRIAR CONTA");
            System.out.println("[2] ACESSAR CONTA");
            System.out.println("[3] SAIR");
            System.out.print("--> ");

            escolha = sc.nextInt();
            System.out.println();

            switch (escolha) {
                case 1:
                    // Criar Conta
                    int senha;
                    System.out.println(
                            "================================================ CRIAR CONTA =====================================================");
                    System.out.print("Digite seu nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Crie sua senha: ");
                    senha = sc.nextInt();
                    conta = new Conta(nome, senha);
                    System.out.println();
                    break;

                case 2:
                    // Login
                    System.out.println(
                            "================================================ LOGIN ======================================================");

                    int tentativas = 1;

                    while (tentativas <= 3) {

                        System.out.print("Entre com o nome: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.print("Entre com a Senha: ");
                        senha = sc.nextInt();
                        System.out.println();

                        // equals é usado para comparar strings
                        if (nome.equals(conta.getNome()) && senha == conta.getSenha()) {

                            // Recebendo a opção
                            do {
                                System.out.println("Escolha a opção: ");
                                System.out.println("[1] CONSULTAR SALDO");
                                System.out.println("[2] CONSULTAR LIMITE");
                                System.out.println("[3] DEPOSITAR");
                                System.out.println("[4] SACAR");
                                System.out.println("[5] SAIR");
                                System.out.print("-->");

                                escolha = sc.nextInt();
                                System.out.println();

                                switch (escolha) {
                                    case 1:
                                        double valor;
                                        System.out.println("Saldo disponível: " + conta.getSaldo());
                                        System.out.println("\tpressione enter para continuar");
                                        sc.nextLine();
                                        sc.nextLine();

                                        break;

                                    case 2:
                                        System.out.println("Limite disponível: " + conta.getLimite());
                                        System.out.println("\tpressione enter para continuar");
                                        sc.nextLine();
                                        sc.nextLine();

                                        break;

                                    case 3:
                                        System.out.print("Digite o valor: ");
                                        valor = sc.nextDouble();
                                        conta.Depositar(valor);
                                        System.out.println("Depósito concluído!");
                                        System.out.println("\tpressione enter para continuar");
                                        sc.nextLine();
                                        sc.nextLine();

                                        break;

                                    case 4:
                                        System.out.print("Digite o valor: ");
                                        valor = sc.nextDouble();
                                        conta.Sacar(valor);

                                        if(conta.Sacar(valor) == true){
                                            System.out.println("Retirando valor...\n Operação efetuada com sucesso!");
                                        }
                                        else{
                                            System.out.println("Saldo ou limite insuficiente!");
                                        }
                                        
                                        System.out.println("\tpressione enter para continuar");
                                        sc.nextLine();
                                        sc.nextLine();

                                        break;
                                }
                            } while (escolha != 5);
                            break;

                        } else {
                            System.out.println("Tente novamente\n tentativas restantes: " + (3 - tentativas));
                            tentativas++;
                        }
                    }
                    break;

                default:
                    break;
            }
        }

        sc.close();

    }

}
