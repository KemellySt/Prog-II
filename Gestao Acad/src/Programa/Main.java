package Programa;
import Alunos.Aluno;
import Cursos.Curso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner e = new Scanner(System.in);
        int escolha;

        // Organizando a tela inicial
        System.out.println("-----------------------------------------Universidade Federal de Ouro Preto------------------------------------\n");
        System.out.println("Seja bem vindo ao sistema de gestão academica!");
        System.out.println("O que você deseja realizar?\n");
        System.out.println("[1] CADASTRO DE ALUNOS RECÉM APROVADOS");
        System.out.println("[2] CADASTRO DE CURSO ");
        System.out.println("[3] CADASTRO DE FUNCIONÁRIOS");
        System.out.print("Escolha: ");

        //Recebendo a escolha
        escolha = e.nextInt();
    

        switch (escolha) {
            case 1:
                // Aluno
                System.out.println("\n--------------------------------------------CADASTRAMENTO DE ALUNOS--------------------------------------------");
                Aluno a;
                a = new Aluno();
                
                    System.out.print("Nome: ");
                    //e.nextLine();
                    a.nome = e.nextLine();
                    System.out.print("Matricula: ");
                    //e.nextLine();
                    a.matricula = e.nextLine();
                    System.out.print("Endereço: ");
                    //e.nextLine();
                    a.endereço = e.nextLine();
                    System.out.print("Telefone:");
                    //e.nextLine();
                    a.telefone = e.nextLine();
                    System.out.print("Curso em que aprovado: ");
                    //e.nextLine();
                    a.CursoA = e.nextLine();

                break;

            case 2:
                //Curso
                System.out.println("\n--------------------------------------------CADASTRAMENTO DE ALUNOS--------------------------------------------");
                int Quant_D;
                Curso c;
                c = new Curso();
                    System.out.println("Quantas disciplinas são? ");
                    Quant_D = e.nextInt();   
                    for(int aux = 1; aux < Quant_D; aux++)
                    {
                        System.out.printf("Disciplina %d: ", aux);
                        e.nextLine();
                        c.disciplinas = e.nextLine();
                    }
                    System.out.print("Código:");
                    c.codigo = e.nextInt();
                    System.out.print("Descrição: ");
                    c.descricao = e.nextLine();
                    System.out.print("Carga horária: ");
                    c.cargah = e.nextInt();
                    System.out.print("Ementa: ");
                    c.ementa = e.nextLine();
                    System.out.print("Bibliografia: ");
                    c.bibliografia = e.nextLine();
                    System.out.print("Pré-Requisitos: ");
                    c.prerequisitos = e.nextLine();

                break;
            
            default:
                break;
        }

        e.close();


    }
}
