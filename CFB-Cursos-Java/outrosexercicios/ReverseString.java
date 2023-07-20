package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite: ");        
        String minhaString = scan.nextLine();
        char[] minhaArray = new char[minhaString.length()];
        char[] invertendo = new char[minhaString.length()];
        minhaArray = minhaString.toCharArray();        

        for(int i=minhaArray.length-1; i>=0; i--){
            //System.out.print(minhaArray[i]);
            invertendo[minhaArray.length - 1 - i] = minhaArray[i];
        }
        minhaString = new String(invertendo);
        System.out.print(minhaString);
        scan.close();
    }
    
}
