package lacos;

import java.util.Scanner;

public class ExFor01 {

    public static void main(String[] args) {
        // variaveis
        int n1, n2, x;
        Scanner input = new Scanner(System.in);
        boolean numDiv = false;


        // inserir valores
        System.out.println("\n Insira o primeiro valor:  ");
        n1 = input.nextInt();
        System.out.println("\n Insira o segundo valor:  ");
        n2 = input.nextInt();  
        
        if (n1 >= n2) {
            System.out.println("\n O segundo valor deve ser maior que o primeiro");
        } else {
            for (x = n1; x <= n2; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.println("\nNumeros divisiveis por 3 e 5: " + x);
                    numDiv = true;
                }
            }
            if(!numDiv) {
            System.out.println("\nNenhum número divisível por 3 e 5 foi encontrado no intervalo.");
        }
    }
  }
}

