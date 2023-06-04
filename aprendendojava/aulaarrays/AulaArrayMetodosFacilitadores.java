package aprendendojava.aulaarrays;
import java.util.Arrays;
//import java.util.Scanner;

public class AulaArrayMetodosFacilitadores {
    public static void main(String[] args) {
        
        int[] num={9,5,0,7,3,6,4,8,1,44};

        for(int n:num){
            System.out.printf(" - %d",n);
        }

        System.out.println("\n=======");
        Arrays.sort(num);
        
        for(int n:num){
            System.out.printf(" - %d",n);
        }

        System.out.println("\n=======");
        Arrays.fill(num,10);
        
        for(int n:num){
            System.out.printf(" - %d",n);
        }

        System.out.println("\n=======");
        int[] num2={1,2,3,4,5,6,7,8,9};
        int[] num3={56,78,23,78,33,57,89,34,23,50};
        System.arraycopy(num2, 0, num3, 0, num2.length);
        
        for(int n:num3){
            System.out.printf(" - %d",n);
        }
        
        System.out.println("\n=======");
        int[] num4={1,2,3,4,5,6,7,8,9};
        int[] num5={56,78,23,78,33,57,89,34,23,50};
        System.arraycopy(num4, 3, num5, 4, 3);
        
        for(int n:num5){
            System.out.printf(" - %d",n);
        }
        
        System.out.println("\n=======");
        int[] num6={1,2,3,4,5,6,7,8,9};
        int[] num7=new int[10];
        System.arraycopy(num6, 3, num7, 4, 3);
        
        for(int n:num7){
            System.out.printf(" - %d",n);
        }

        System.out.println("\n=======");          
        int[] num8={7,3,5,100,9};
        int[] num9={7,3,5,100,9};
        int[] num10={3,5,7,9,100};        
        
        System.out.printf("num9 igual num8: %s\n",Arrays.equals(num9, num8)?"Igual":"Diferente");
        System.out.printf("num9 igual num10: %s\n",Arrays.equals(num9, num10)?"Igual":"Diferente");

        int valor=100;
        int valor2=3;
        int pos=Arrays.binarySearch(num8,valor);
        int pos2=Arrays.binarySearch(num8,valor2);

        System.out.println("\n======="); 
        System.out.printf("\n%d esta no array? %s - posicao: %d\n",valor,pos>-1?"sim":"nao",pos); 
        System.out.printf("\n%d esta no array? %s - posicao: %d\n",valor2,pos2>-1?"sim":"nao",pos2); 

        Arrays.sort(num8);
        pos2=Arrays.binarySearch(num8,valor2);
        System.out.printf("\n%d esta no array? %s - posicao: %d\n",valor2,pos2>-1?"sim":"nao",pos2);

    }
    
}
