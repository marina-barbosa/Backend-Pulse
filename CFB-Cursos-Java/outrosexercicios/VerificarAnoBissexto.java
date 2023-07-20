package aprendendojava.outrosexercicios;

public class VerificarAnoBissexto {

    public static void main(String[] args) {

        // Regras para Ano Bissexto: Deve ser divisível por 4. Se o ano for divisível por 100, ele não será bissexto, a menos que também seja divisível por 400.
        
        int ano = 2024;

        if (isAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

    public static boolean isAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}







