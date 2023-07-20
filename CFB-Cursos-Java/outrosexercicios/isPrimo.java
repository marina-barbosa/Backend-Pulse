package aprendendojava.outrosexercicios;

import java.util.Scanner;

public class isPrimo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int contador = 0;
        String primo="yes";
        for(int i=1; i<num+1; i++){
          if(num%i == 0){
          contador++;
          }
        }
        if(contador>2){
          primo="no";
        }
        System.out.println(primo);
        scan.close();
      }
    
}
