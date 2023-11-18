import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int idade, anoN, anoA, mesN, diaN, mesA, diaA;

        /*Orientação*/
        System.out.println("Preencha informações a seguir!");

        /*Pedindo as informações*/

        Scanner sc = new Scanner(System.in);
        /*Nascimento*/
            System.out.println("Digite o dia em que você nasceu: ");
            diaN = sc.nextInt();

            System.out.println("Digite o mês em que você nasceu: ");
            mesN = sc.nextInt();

            System.out.println("Digite o ano em que você nasceu: ");
            anoN = sc.nextInt();

            /*Atual*/
            System.out.println("Digite o dia atual: ");
            diaA = sc.nextInt();

            System.out.println("Digite o mês atual: ");
            mesA = sc.nextInt();

            System.out.println("Digite o ano atual: ");
            anoA = sc.nextInt();

        sc.close();

        /* Calculando */
        if(mesA >= mesN)
        {
            if(diaA >= diaN)
            {
                idade = anoA - anoN;
            }
            else
            {
                idade = (anoA - anoN) - 1;
            }   
        }
        else
        idade = (anoA - anoN) - 1;

        /*Condição */
            if(idade >= 18)
            {
                JOptionPane.showMessageDialog(null, "Olá, seja bem vindo!");
                JOptionPane.showMessageDialog(null, "Fique a vontade!");
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Acesso Negado!");
            }


    }
}
