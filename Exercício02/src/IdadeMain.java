/*
    Nome: Kemelly Steisse da Silva - 23.1.8111
    Engenharia da   Computação
    Programação de Computadores II
*/

import javax.swing.JOptionPane;
public class IdadeMain {
    public static void main(String[] args) throws Exception {
        int idade, anoN, anoA, mesN, diaN, mesA, diaA;

        /*Dando as orientações*/
        JOptionPane.showMessageDialog(null, "Segue as orientações a seguir!");
        JOptionPane.showMessageDialog(null, "Preencha a seguir as informações pedidas!");

        /*Calculando a idade */
            /* Nascimento */
            diaN = Integer.parseInt(JOptionPane.showInputDialog("Qual é o dia em que você nasceu? "));
            mesN = Integer.parseInt(JOptionPane.showInputDialog("Qula é o mês em que você nasceu? "));
            anoN = Integer.parseInt(JOptionPane.showInputDialog("Qual é o ano em que você nasceu? "));

            /* Atual */
            diaA = Integer.parseInt(JOptionPane.showInputDialog("Qual é o dia de hoje?  "));
            mesA = Integer.parseInt(JOptionPane.showInputDialog("Qual é o mês atual? "));
            anoA = Integer.parseInt(JOptionPane.showInputDialog("Qual é o ano atual? "));

            /* Cálculo de idade */
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
