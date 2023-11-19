package Programa;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        // Kemelly Steisse da Silva - 23.1.8111

        // Organizando a tela inicial
        Scanner sc = new Scanner(System.in);
        String nome, cpf, endereco, telefone, matricula, nomeDocurso, disciplinas, descricao, titulacao, areaP;
        int escolha, ctps;
        Double salario;
        Aluno aluno[];
        Funcionario funcionario[];
        Professor professor[];
        Random r = new Random();

        do{

            System.out.println(
                    "---------------------------------------- SISTEMA DE CADASTRAMENTO - UFOP ----------------------------------------------");
            System.out.println("O que deseja fazer? ");
            System.out.println("[1] CADASTRAR ALUNO");
            System.out.println("[2] CADASTRAR FUNCIONÁRIO");
            System.out.println("[3] SAIR");
            System.out.print("--> ");
            escolha = sc.nextInt();
            System.out.println();

            switch (escolha) {
                case 1:

                    System.out.println(
                            "\n-------------------------------------------- CADASTRAMENTO DE ALUNOS --------------------------------------------");

                    int Quant_Alunos;
                    int codigo;
                    System.out.println("Digite quantos alunos deseja cadastrar: ");
                    Quant_Alunos = sc.nextInt();
                    aluno = new Aluno[Quant_Alunos];

                    for (int i = 0; i < Quant_Alunos; i++) {

                        // Aluno
                        System.out.println("0" + (i + 1) + " Digite o nome do aluno: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o cpf do aluno: ");
                        cpf = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o endereco do aluno: ");
                        endereco = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o telefone do aluno: ");
                        telefone = sc.nextLine();
                        System.out.println("Gerando matricula do aluno... ");
                        matricula = String.format("%d", r.nextInt(1000000, 9000000));

                        // Curso
                        System.out.println("Nome do curso: ");
                        nomeDocurso = sc.nextLine();
                        System.out.println("Digite as disciplinas: ");
                        disciplinas = sc.nextLine();
                        codigo = sc.nextInt();
                        descricao = sc.nextLine();

                        aluno[i] = new Aluno(nome, cpf, endereco, telefone, matricula, nomeDocurso, disciplinas, codigo,
                                descricao);
                    }

                    for (int j = 0; j < Quant_Alunos; j++) {
                        System.err.println(
                                "---------------------------------- INFORMAÇÕES --------------------------------");
                        System.out.print("\n");
                        System.out.print("--> Dados Aluno\n");
                        System.err.print("\n");
                        aluno[j].mostrarAluno();
                        System.err.print("\n");

                    }
                    break;

                case 2:
                System.out.println(
                            "\n-------------------------------------------- CADASTRAMENTO DE FUNCIONÁRIOS --------------------------------------------");
                // Funcionário
                int Quant_Func, escolha2;
                System.out.println("Quantos funcionários deseja cadastrar? ");
                Quant_Func = sc.nextInt();
                funcionario = new Funcionario[Quant_Func];
                System.out.println("Este funcionário é:\n[1] Professor\n [2] Técnico Administrativo");
                escolha2 = sc.nextInt();

                if(escolha2 == 1){
                // Professor

                    for(int i = 0; i < Quant_Func; i++){

                        //Dados pessoa
                        System.out.println("0" + (i + 1) + "Digite o nome do professor: ");
                        nome = sc.nextLine();
                        System.out.println("0" + (i + 1) + "Digite o cpf do professor: ");
                        cpf = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o endereco do professor: ");
                        endereco = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o telefone do professor: ");
                        telefone = sc.nextLine();
                        // Dados funcionario
                        System.out.println("CTPS do professor: ");
                        ctps = sc.nextInt();
                        System.out.println("Cadastrar salário: ");
                        salario = sc.nextDouble();
                        System.out.println("CTPS do professor: ");
                        //Dados professor
                        System.out.println("======================= ÁREA PARA CADASTRAMENTO DE PROFESSORES =========================");
                        System.out.println("");;

                    }

                }
                else{
                // Técnico Administrativo
                    for(int i = 0; i < Quant_Func; i++){

                        //Dados pessoa
                        System.out.println("0" + (i + 1) + "Digite o nome do funcionário: ");
                        nome = sc.nextLine();
                        System.out.println("0" + (i + 1) + "Digite o cpf do funcionário: ");
                        cpf = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o endereco do funcionário: ");
                        endereco = sc.nextLine();
                        System.out.println("0" + (i + 1) + " Digite o telefone do funcionário: ");
                        telefone = sc.nextLine();
                        // Dados funcionario
                        System.out.println("CTPS do funcionário: ");
                        ctps = sc.nextInt();
                        System.out.println("Cadastrar salário: ");
                        salario = sc.nextDouble();
                        System.out.println("CTPS do funcionário: ");
                        ctps = sc.nextInt();

                    }

                }

                for (int j = 0; j < Quant_Func; j++) {
                        System.err.println(
                                "----------------------------------INFORMAÇÕES--------------------------------");
                        System.out.print("\n");
                        System.out.print("--> Dados Funcuonário\n");
                        System.err.print("\n");
                        funcionario[j].mostrarFuncionario();
                        System.err.print("\n");
                }
            
                    break;

                case 3:
                    break;

                default:
                    break;
            }


            // Imprimindo todos as informações
            /*
             * System.err.println(
             * "----------------------------------INFORMAÇÕES--------------------------------"
             * );
             * System.err.print("\n");
             * System.out.print("Dados Aluno\n");
             * System.err.print("\n");
             * aluno[0].mostrarAluno();
             * System.err.print("\n");
             */
        }while(escolha != 4);

        sc.close();
    }

}
