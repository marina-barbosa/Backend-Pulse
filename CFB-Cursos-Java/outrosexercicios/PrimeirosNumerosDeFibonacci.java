package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class PrimeirosNumerosDeFibonacci {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        //int a=0;
        int b=0;
        int fibo=0;
        System.out.print("0, 1");
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                fibo = 1;
                b = 0;
            } else {
                fibo += b;
                b = fibo - b;
                System.out.print(", "+fibo);
            }
  
        }
        scan.close();

    }
    
}
