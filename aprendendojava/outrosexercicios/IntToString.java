
public class IntToString {
    public static void main(String[] args) {

        /*
        int numeroInteiro = 42;
        String numeroString = String.valueOf(numeroInteiro);

        
        */

        int numeroInteiro = 42;
        String numeroString = "" + numeroInteiro;

        if (numeroString.getClass() == String.class) {
            System.out.println("É uma string!"); 
        }


    }
    
}
