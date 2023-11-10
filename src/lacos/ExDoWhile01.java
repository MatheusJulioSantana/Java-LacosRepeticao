package lacos;

import java.util.Scanner;

public class ExDoWhile01 {

    public static void main(String[] args) {
        int num, resultado = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nInsira um valor: ");
            num = input.nextInt();

            if (num > 0) {
                resultado += num;
                System.out.println("\nSoma parcial: " + resultado);
            }else {
            	System.out.println("\n Valor invalido"); 
            }
        } while (num != 0);

        System.out.println("\nSoma total dos números positivos digitados: " + resultado);
    }
}
