import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num, maior = 0, menor = 0;

        Scanner a = new Scanner(System.in);
            System.out.println("Digite um número de 0 a 100: ");
            num = a.nextInt();
        a.nextInt();

        if(num <= 100 && num >=0)
        {
            maior = num;
            menor = num;

            while(num <= 100 && num >= 0);
            {
                if(num > maior)
                {
                    maior = num;
                }
                if(num < menor)
                {
                    menor = num;
                }

                Scanner sc = new Scanner(System.in);

                    System.out.println("Digite um número de 0 a 100: ");
                    num = sc.nextInt();

                sc.close();
            }
        }
    }
}
