package src;

import java.util.Scanner;

public class Cofre {

    public static void main(String[] args) {

        int n;
        int j =0;
        int z =0;
        int contador = 0;
        int[] resultado = new int[100];

        Scanner scan = new Scanner(System.in);

     do {
         n = scan.nextInt();
         if (n!=0) {
             contador++;
             for (int i = 0; i < n; i++) {
                 j = scan.nextInt();
                 z = scan.nextInt();
                 resultado[i] = j - z;
             }
             System.out.println("Teste " + contador);
             for (int i = 0; i < n; i++) {
                 System.out.println(resultado[i]);
             }
             System.out.println("");
         }

     }while (n!=0);

    }
}
