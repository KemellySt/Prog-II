import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        // Alunos:
        // Kemelly Steisse da Silva - 23.1.8111
        // Vitor Angelo dos Santos - 23.1.8113
        // Engenharia de Software - 2º Período

        Scanner sc = new Scanner(System.in);

        Contato contato = new Contato();
        Agenda agenda = new Agenda();
        String nome, endereco, email;
        int dia, mes, ano, tamanho = 0;
        int escolha = 0;

        while(escolha != 1 && escolha != 2){

            // Adicionar contato
            System.out.println("\n------------------------------------- Adicionar Contato -------------------------------------\n");
            System.out.println("Você deseja adicionar um contato?");
            System.out.println("[1] SIM\n[2] NÃO\n");
            System.out.print("---> ");
            escolha = sc.nextInt();

            if(escolha == 1){

                int quantidade = 0;
                System.out.println("\nQuantos contatos você deseja adicionar?\n");
                System.out.print("---> ");
                quantidade = sc.nextInt();
                agenda = new Agenda(quantidade);

                for(int i = 0; i < quantidade; i++){

                    System.out.println("\nQual o tipo de contato você deseja adicionar?");
                    System.out.println("[1] Amigo\n[2] Conhecido\n");
                    System.out.print("---> ");
                    int escolha2;
                    escolha2 = sc.nextInt();

                    if(escolha2 == 1){
                        System.out.println("\n------------------------------------- Adicionar Amigo -------------------------------------\n");
                        System.out.println("Digite o nome do amigo: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.println("\nDigite o endereço do amigo: ");
                        endereco = sc.nextLine();
                        System.out.println("\nDigite a data de aniversário do amigo: ");
                        System.out.print("Dia: ");
                        dia = sc.nextInt();
                        System.out.print("Mês: ");
                        mes = sc.nextInt();
                        System.out.print("Ano: ");
                        ano = sc.nextInt();
                        System.out.println("Adicionando Amigo...");
                        contato = new Amigo(nome, endereco, dia, mes, ano);
                        agenda.addContato(contato, tamanho);
                        System.out.println("Amigo adicionado com sucesso!");
                        tamanho = tamanho + 1;
                    }

                    else if(escolha2 == 2){

                        System.out.println("\n------------------------------------- Adicionar Conhecido -------------------------------------\n");
                        System.out.println("Digite o nome do conhecido: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.println("\nDigite o endereço do conhecido: ");
                        endereco = sc.nextLine();
                        System.out.println("\nDigite o email do conhecido: ");
                        email = sc.nextLine();
                        contato = new Conhecido(nome, endereco, email);
                        agenda.addContato(contato, tamanho);
                        System.out.println("Conhecido adicionado com sucesso!");
                        tamanho = tamanho + 1;
                    }
                }
            }

            else{
                System.out.println("Você não adicionou nenhum contato.");
            }
        }

        // Impressão lista de contatos
        System.out.println("\nVocê deseja imprimir a lista de contatos? ");
        System.out.println("[1] SIM\n[2] NÃO\n");
        System.out.print("---> ");
        int escolha3;
        escolha3 = sc.nextInt();

        if(escolha3 == 1){
            System.out.println("Imprimindo lista de contatos...\n");
            System.out.println("------------------------------------- Lista de Contatos -------------------------------------\n");
            agenda.Impressão(tamanho, contato);
        }
    
    sc.close();

    }
}
