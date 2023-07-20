package aprendendojava.outrosexercicios;
import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite uma palavra: ");
            String texto = scan.nextLine();
            char ch1 = texto.charAt(0);
     
            System.out.println(ch1);
        }
      
            
            
        
    }
    
}