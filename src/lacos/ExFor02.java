package lacos;

import java.util.Scanner;

public class ExFor02 {

    public static void main(String[] args) {
        // variaveis
        int num, pares = 0, impares = 0;
        Scanner input = new Scanner(System.in);

        // inserir valores
        for (int x = 1; x <= 10; x++) {
            System.out.println("\nDigite o " + x + "º número: ");
            num = input.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibir resultados
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

