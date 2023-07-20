package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        
        double res=Math.sqrt(num);
        
        num = (int) res;
        System.out.println(num);
        //System.out.println(res);
        scan.close();
      }
    
}
