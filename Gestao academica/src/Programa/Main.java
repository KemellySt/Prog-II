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
                    "========================================== SISTEMA DE CADASTRAMENTO - UFOP ==========================================\n");
            System.out.println("... QUAL SERVIÇO SERÁ USADO? ...");
            System.out.println("[1] CADASTRAR ALUNO");
            System.out.println("[2] CADASTRAR FUNCIONÁRIO");
            System.out.println("[3] SAIR");
            System.out.print("--> ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:

                    System.out.println(
                            "\n=========================================== CADASTRAMENTO DE ALUNOS ================================================\n");

                    int Quant_Alunos;
                    int codigo;
                    System.out.println("Digite quantos alunos deseja cadastrar: ");
                    Quant_Alunos = sc.nextInt();
                    aluno = new Aluno[Quant_Alunos];

                    for (int i = 0; i < Quant_Alunos; i++) {

                        // Aluno
                        System.out.println("[" + (i + 1) + "]" + "Aluno");
                        System.out.println("\n0" + (1) + ")" + " Digite o nome do aluno: ");
                        System.out.print("--> ");
                        if (i == 0)
                            sc.nextLine();
                        nome = sc.nextLine();
                        System.out.println("\n0" + (2) + ")" + " Digite o cpf do aluno: ");
                        System.out.print("--> ");
                        cpf = sc.nextLine();
                        System.out.println("\n0" + (3) + ")" + " Digite o endereco do aluno: ");
                        System.out.print("--> ");
                        endereco = sc.nextLine();
                        System.out.println("\n0" + (4) + ")" + " Digite o telefone do aluno: ");
                        telefone = sc.nextLine();
                        System.out.println("\nGerando matricula do aluno... ");
                        matricula = String.format("%d", r.nextInt(1000000, 9000000));
                        System.out.println("Matrícula gerada com sucesso!");

                        // Curso
                        System.out.println("\n--> Graduação ");
                        System.out.print("\n0" + (i + 5) + ")" + "Nome do curso: \n");
                        System.out.print("-->");
                        nomeDocurso = sc.nextLine();
                        System.out.print("\n--> Cadastrar disciplinas ");
                        System.out.print("\nDigite a quantidades de disciplinas: ");
                        TotalDisc = sc.nextInt();
                        disciplina = new String[TotalDisc];

                        for (int a = 0; a < TotalDisc; a++) {
                            System.out.print("\n-->");
                            if (a == 0)
                                sc.nextLine();
                            disciplina[a] = sc.nextLine();
                        }

                        System.out.println("\n0" + (6) + ")" + " Digite o código do curso: ");
                        System.out.print("--> ");
                        codigo = sc.nextInt();
                        System.out.println("\n0" + (7) + ")" + " Digite a descrição do curso: ");
                        System.out.print("--> ");
                        sc.nextLine();
                        descricao = sc.nextLine();

                        aluno[i] = new Aluno(nome, cpf, endereco, telefone, matricula, nomeDocurso, disciplina, codigo,
                                descricao);
                    }
                    // Mostrar as informações
                    System.out.println(
                            "\n===================================== BANCO DE DADOS - ALUNO =========================================\n");
                    System.out.println("Imprimir relatório de alunos?");
                    System.out.println("[1] SIM\n[2] NÃO");
                    System.out.print("-->");
                    int escolha1;
                    escolha1 = sc.nextInt();

                    if (escolha1 == 1)
                        System.out.println("\nImprimir relatório: \n[1] Um Aluno\n[2] Todos alunos");
                    System.out.print("--> ");
                    int escI2 = sc.nextInt();

                    if (escI2 == 1) {
                        System.out.println("Digite a posição do professor que deseja imprimir? ");
                        int escA;
                        System.out.print("--> ");
                        escA = sc.nextInt();

                        for (int j = 0; j < Quant_Alunos; j++) {
                            if (escA == j) {
                                aluno[j].mostrarAluno();
                                System.err.print("\n");
                            }
                        }
                    }
                    else {
                            for(int k = 0; k < Quant_Alunos; k++){
                                aluno[k].mostrarAluno();
                                System.out.println("\n");
                            }
                        }
                        
                    break;

                case 2:
                    System.out.println(
                            "\n-======================================= CADASTRAMENTO DE FUNCIONÁRIOS ==========================================\n");
                    // Funcionário
                    int Quant_Func, escolha2;
                    System.out.println("Quantos funcionários deseja cadastrar? ");
                    Quant_Func = sc.nextInt();
                    funcionario = new Funcionario[Quant_Func];

                    System.out.println("Este funcionário é:\n[1] Professor\n[2] Técnico Administrativo");
                    System.out.print("--> ");
                    escolha2 = sc.nextInt();
                    for (int k = 0; k < Quant_Func; k++) {

                        if (escolha2 == 1) {
                            // Professor
                            professor = new Professor[Quant_Func];
                            for (int i = 0; i < Quant_Func; i++) {

                                // Dados pessoa
                                System.out.println("[" + (i + 1) + "]" + " Professor\n");
                                System.out.println(
                                        "========================= ÁREA PARA CADASTRAMENTO DOS DOCENTES =========================\n");
                                System.out.println("0" + (1) + ")" + " Digite o nome do professor: ");
                                System.out.print("--> ");
                                sc.nextLine();
                                nome = sc.nextLine();
                                System.out.println("\n0" + (2) + ")" + " Digite o cpf do professor: ");
                                System.out.print("--> ");
                                cpf = sc.nextLine();
                                System.out.println("\n0" + (3) + ")" + " Digite o endereco do professor: ");
                                System.out.print("--> ");
                                endereco = sc.nextLine();
                                System.out.println("\n0" + (4) + ")" + " Digite o telefone do professor: ");
                                System.out.print("--> ");
                                telefone = sc.nextLine();

                                // Dados funcionario
                                System.out.println("\n0" + (5) + ")" + " CTPS do professor: ");
                                System.out.print("--> ");
                                ctps = sc.nextLine();
                                System.out.println("\n0" + (6) + ")" + " Cadastrar salário: ");
                                System.out.print("--> ");
                                salario = sc.nextDouble();

                                // Dados professor
                                System.out.println("--> Cadastrar disciplinas ");
                                System.out.println("Quantas são: ");
                                TotalDisc = sc.nextInt();
                                disciplina = new String[TotalDisc];
                                System.out.print("Digite as disciplinas: ");

                                for (int a = 0; a < TotalDisc; a++) {

                                    System.out.print("\n-->");
                                    sc.nextLine();
                                    disciplina[a] = sc.nextLine();

                                }

                                System.out.println("\n0" + (7) + ")" + "Area de Pesquisa:");
                                areaP = sc.nextLine();
                                System.out.println("\n0" + (8) + ")" + "Titulação: ");
                                titulacao = sc.nextLine();
                                professor[i] = new Professor(titulacao, areaP, nome, cpf, endereco, telefone, ctps,
                                        salario,
                                        disciplina);

                            }
                            // Mostrar as informações
                            System.out.println(
                                    "===================================== BANCO DE DADOS - PROFESSOR =========================================\n");
                            System.out.println("Imprimir relatório de professores?");
                            System.out.println("[1] SIM\n[2] NÃO");
                            System.out.print("-->");
                            int escolha3;
                            escolha3 = sc.nextInt();

                            if (escolha3 == 1) {
                                System.out.println("\nImprimir relatório: \n[1] Um professor\n[2] Todos professores");
                                System.out.print("-->");
                                int escI;
                                escI = sc.nextInt();

                                if (escI == 1) {
                                    System.out.println("Digite a posição do professor que deseja imprimir? ");
                                    int escP;
                                    System.out.print("--> ");
                                    escP = sc.nextInt();

                                    for (int j = 0; j < Quant_Func; j++) {

                                        if (escP == j) {
                                            professor[j].mostrarProfessor();
                                            System.out.print("\n");
                                        }
                                    }
                                }
                                else{
                                    for(int a = 0; a < Quant_Func; a++){
                                        professor[a].mostrarProfessor();
                                            System.out.print("\n");
                                    }
                                }
                            }
                        }

                        else {
                            // Técnico Administrativo
                            System.out.println(
                                    "========================= ÁREA PARA CADASTRAMENTO DOS TÉCNICOS ===========================");

                            for (int i = 0; i < Quant_Func; i++) {
                                // Dados pessoa
                                System.out.println("\n[" + (i + 1) + "]" + " Técnico Administrativo\n");
                                System.out.println("0" + (1) + ")" + " Digite o nome do funcionário: ");
                                System.out.print("--> ");
                                sc.nextLine();
                                nome = sc.nextLine();
                                System.out.println("0" + (2) + ")" + " Digite o cpf do funcionário: ");
                                System.out.print("--> ");
                                cpf = sc.nextLine();
                                System.out.println("0" + (3) + ")" + " Digite o endereco do funcionário: ");
                                System.out.print("--> ");
                                endereco = sc.nextLine();
                                System.out.println("0" + (4) + ")" + " Digite o telefone do funcionário: ");
                                System.out.print("--> ");
                                telefone = sc.nextLine();
                                // Dados funcionario
                                System.out.println("0" + (5) + ")" + " CTPS do funcionário: ");
                                System.out.print("--> ");
                                ctps = sc.nextLine();
                                System.out.println("0" + (6) + ")" + " Cadastrar salário: ");
                                System.out.print("--> ");
                                salario = sc.nextDouble();

                                funcionario[i] = new Funcionario(nome, cpf, telefone, endereco, ctps, salario);

                            }
                            // Mostrar as informações
                            System.out.println(
                                    "===================================== BANCO DE DADOS - TÉCNICOS =========================================\n");
                            System.out.println("Imprimir relatório de técnicos?");
                            System.out.println("[1] SIM\n[2] NÃO");
                            System.out.print("-->");
                            int escolha3;
                            escolha3 = sc.nextInt();

                            if (escolha3 == 1) {
                                System.out.println("Imprimir relatório: \n[1] Um técnico\n[2] Todos técnicos");
                                System.out.print("--> ");
                                int escI;
                                escI = sc.nextInt();

                                if (escI == 1) {
                                    System.out.println("Digite a posição do técnico que deseja imprimir? ");
                                    int escT;
                                    System.out.print("--> ");
                                    escT = sc.nextInt();

                                    for (int j = 0; j < Quant_Func; j++) {

                                        if (escT == j) {
                                            funcionario[j].mostrarFuncionario();
                                            System.out.print("\n");
                                        }
                                        }
                                }
                                else{
                                    for(int a = 0; a < Quant_Func; a++){
                                        funcionario[a].mostrarFuncionario();
                                        System.out.print("\n");
                                    }
                                }
                            }
                        }
                    }

                    break;

                case 3:
                    System.out.println("...");
                    sc.nextLine();
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    break;
            }
        } while (escolha != 3);

        sc.close();
    }

}
