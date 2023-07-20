package aprendendojava.aulaarrays;

public class AulaArraysComParametros {
    public static void main(String[] args) {
        
        
        String nome="Bruno";
        for(char c:nome.toCharArray()){
            System.out.printf("%c\n",c);
        }

    int[] numeros={10,5,15,20,300,25,14,6,7,8,98,75,62};
    parImpar(numeros);

    int[] notas={10,85,62,45,98,78,60,67,65,82};
    int[] resultado={0,0};
    conferirNotas(notas,resultado);

    System.out.printf("Aprovados.: %d\n",resultado[0]);
    System.out.printf("Reprovados: %d\n",resultado[1]);

    int[] valores={10,5,2,3};
    int n3=1000;
    int res=soma2(34,78,256,7,9,84,356,2,n3);

    System.out.printf("\n%d",soma(valores));
    System.out.printf("\n%d",res);

    }

    public static void parImpar(int[] num){
        String res;
        for(int n:num){
            if(n%2==0){
                res="Par";
            }else{
                res="Impar";
            }
            System.out.printf("%d: %s\n",n,res);
        }
    }

    public static void conferirNotas(int[] nt, int[] r){
        for(int n:nt){
            if(n>=60){
                r[0]++;
            }else{  
                r[1]++;
            }
        }
    }

    public static int soma(int[] v){
        int res=0;
        for(int n:v){
            res+=n;
        }
        return res;
    }

    public static int soma2(int... v){
        int res=0;
        for(int n:v){
            res+=n;
        }
        return res;
    }
}
