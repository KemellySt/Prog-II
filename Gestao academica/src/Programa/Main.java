package Programa;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        // Kemelly Steisse da Silva - 23.1.8111

        // Organizando a tela inicial
        Scanner sc = new Scanner(System.in);
        int escolha;
        Aluno aluno[];
        // Funcionario funcionario[];
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
                            "\n--------------------------------------------CADASTRAMENTO DE ALUNOS--------------------------------------------");

                    String nome, cpf, endereco, telefone, matricula, nomeDocurso, disciplinas, descricao;
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
                                "----------------------------------INFORMAÇÕES--------------------------------");
                        System.out.print("\n");
                        System.out.print("--> Dados Aluno\n");
                        System.err.print("\n");
                        aluno[j].mostrarAluno();
                        System.err.print("\n");

                    }
                    break;

                case 2:

                    // Funcionário


                    break;

                case 3:
                    break;

                default:
                    break;
            }
            /*
             * System.out.print("Dados Curso\n");
             * System.err.print("\n");
             * curso.mostrarCurso();
             * System.err.print("\n");
             * 
             * System.err.print("Dados Funcionário\n");
             * System.out.print("\n");
             * f.mostrarFuncionario();
             */

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
