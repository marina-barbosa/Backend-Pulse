package aprendendojava.outrosexercicios;
import java.util.*;

public class somaDoisScan {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
      
        int soma=num1+num2;
        System.out.println(soma);
        scan.close();
    }
    
}
