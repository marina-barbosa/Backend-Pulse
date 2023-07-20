package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scan.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
    
}
