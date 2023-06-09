package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class PrimeiroUltimoChar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        
        int tam = texto.length()-1;
        char ultimoChar = texto.charAt(tam);
        char primeiroChar = texto.charAt(0);

        //String teste = "";
        //teste = teste + primeiroChar + ultimoChar;

        String teste = Character.toString(primeiroChar) + Character.toString(ultimoChar);

        System.out.print(teste);
        scan.close();
        
        
        
    }
}
