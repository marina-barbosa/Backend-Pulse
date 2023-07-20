package aprendendojava.outrosexercicios;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        char[] vowel={'a','e','i','o','u'};
        boolean isVowel =false;
        
        Scanner scanletter=new Scanner(System.in);
        System.out.printf("\nDigite uma letra: ");
        char letter=scanletter.next().charAt(0); 

        for(char l:vowel) {
            if(letter==l){
                isVowel=true;
            }
            //System.out.println(l);
            //System.out.println(isVowel);
        }  

        System.out.printf("%s",isVowel?"vowel":"consonant"); 
        
        scanletter.close();

        
    }
    
}
