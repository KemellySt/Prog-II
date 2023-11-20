package Programa;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        // Kemelly Steisse da Silva - 23.1.8111

        // Organizando a tela inicial
        Scanner sc = new Scanner(System.in);
        String nome, cpf, endereco, telefone, matricula, nomeDocurso, descricao, titulacao, areaP, ctps;
        int escolha, TotalDisc;
        Double salario;
        Aluno aluno[];
        Funcionario funcionario[];
        Professor professor[];
        String[] disciplina;
        Random r = new Random();

        do {

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
                        System.out.println("--> Cadastrar disciplinas ");
                        System.out.print("Digite a quantidades de disciplinas: ");
                        TotalDisc = sc.nextInt();
                        disciplina = new String[TotalDisc];
                        for(int a = 0; a < TotalDisc; a++){
                            System.out.print("\n-->");
                            sc.nextLine();
                            disciplina[a] = sc.nextLine();
                        }
                        System.out.println("Digite o código: ");
                        codigo = sc.nextInt();
                        System.out.println("Digite a descrição do curso: ");
                        sc.nextLine();
                        descricao = sc.nextLine();

                        aluno[i] = new Aluno(nome, cpf, endereco, telefone, matricula, nomeDocurso, disciplina, codigo,
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
                    System.out.println("Este funcionário é:\n[1] Professor\n[2] Técnico Administrativo");
                    escolha2 = sc.nextInt();

                    if (escolha2 == 1) {
                        // Professor
                        professor = new Professor[Quant_Func];
                        for (int i = 0; i < Quant_Func; i++) {

                            // Dados pessoa
                            System.out.println(
                                    "========================= ÁREA PARA CADASTRAMENTO DOS DOCENTES =========================");
                            System.out.println("0" + (i + 1) + ")" + "Digite o nome do professor: ");
                            sc.nextLine();
                            nome = sc.nextLine();
                            System.out.println("0" + (i + 1) + ")" + "Digite o cpf do professor: ");
                            cpf = sc.nextLine();
                            System.out.println("0" + (i + 1) + ")" +"Digite o endereco do professor: ");
                            endereco = sc.nextLine();
                            System.out.println("0" + (i + 1) + ")" +"Digite o telefone do professor: ");
                            telefone = sc.nextLine();

                            // Dados funcionario
                            System.out.println("0" + (i + 1) + ")" +"CTPS do professor: ");
                            ctps = sc.nextLine();
                            System.out.println("0" + (i + 1) + ")" +"Cadastrar salário: ");
                            salario = sc.nextDouble();
                            
                            // Dados professor
                            System.out.println("--> Cadastrar disciplinas ");
                            System.out.println("Quantas são: ");
                            TotalDisc = sc.nextInt();
                            disciplina = new String[TotalDisc];
                            System.out.print("Digite as disciplinas: ");

                            for(int a = 0; a < TotalDisc; a++){

                                System.out.print("\n-->");
                                sc.nextLine();
                                disciplina[a] = sc.nextLine();

                            }

                            System.out.println("Area de Pesquisa:");
                            areaP = sc.nextLine();
                            System.out.println("Titulação: ");
                            titulacao = sc.nextLine();
                            professor[i] = new Professor(titulacao, areaP, nome, cpf, endereco, telefone, ctps, salario, disciplina);

                            for (int j = 0; j < Quant_Func; j++) {
        
                                professor[j].mostrarProfessor();
                                System.err.print("\n");
                            }

                        }

                    } else {
                        // Técnico Administrativo
                        System.out.println(
                                    "========================= ÁREA PARA CADASTRAMENTO DOS TÉCNICOS =========================");
                        for (int i = 0; i < Quant_Func; i++) {

                            // Dados pesso
                            System.out.println("0" + (i + 1) +")" + "Digite o nome do funcionário: ");
                            //sc.nextLine();
                            nome = sc.nextLine();
                            System.out.println("0" + (i + 1) +")" + "Digite o cpf do funcionário: ");
                            cpf = sc.nextLine();
                            System.out.println("0" + (i + 1) +")" + "Digite o endereco do funcionário: ");
                            endereco = sc.nextLine();
                            System.out.println("0" + (i + 1) +")" + "Digite o telefone do funcionário: ");
                            telefone = sc.nextLine();
                            // Dados funcionario
                            System.out.println("0" + (i + 1) +")" + "CTPS do funcionário: ");
                            ctps = sc.nextLine();
                            System.out.println("0" + (i + 1) +")" + "Cadastrar salário: ");
                            salario = sc.nextDouble();

                            
                            funcionario[i] = new Funcionario(nome, cpf, telefone, endereco, ctps, salario);

                            for (int j = 0; j < Quant_Func; j++) {
                    
                                funcionario[j].mostrarFuncionario();
                                System.err.print("\n");
                            }
                        }
                    }

                    break;

                case 3:
                    break;

                default:
                    break;
            }
        } while (escolha != 4);

        sc.close();
    }

}
