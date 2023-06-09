package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class Alfanumerico {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite: ");        
        String minhaString = scan.nextLine();
        boolean contemLetras = false;
        boolean contemNumeros = false;
        int qtddLetras = 0;
        int qtddNumeros = 0;
        

        for (char c : minhaString.toCharArray()) {
            if (Character.isLetter(c)) {
                contemLetras = true;
                qtddLetras += 1;
            } else if (Character.isDigit(c)) {
                contemNumeros = true;
                qtddNumeros += 1;
            }

            /*if (contemLetras && contemNumeros) {
                break;
            }*/
        }

        System.out.println("Contém letras? " + contemLetras + " - " + qtddLetras);
        System.out.println("Contém números? " + contemNumeros + " - " + qtddNumeros);

        scan.close();
    }
    
}
