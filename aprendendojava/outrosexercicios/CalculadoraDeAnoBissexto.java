package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class CalculadoraDeAnoBissexto {
    public static void main(String[] args) {
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("digite o ano: ");
        int ano=scan.nextInt();

        int ref=ano%4;

        if(ref==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        scan.close();




    }
    
}
