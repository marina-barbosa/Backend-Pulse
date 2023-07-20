package aprendendojava;

public class AulaMetodos {
    public static void main(String[] args) {

        msg("testando funçoes msg e somas", 3);
        System.out.println(soma3(10,20));
        System.out.println(soma(2,5,10,20,88));
        System.out.println(soma(1.5,4.8,9.25,1.0));
        
        
    }

    public static int soma(int... numeros) {
        int res=0;
        for(int i:numeros){
            res+=i;
        }
        return res;
    }

    public static Double soma(Double... numeros) {
        Double res=0.0;
        for(Double i:numeros){
            res+=i;
        }
        return res;
    }

    public static int soma3(int n1, int n2) {
        int res= n1 + n2;        
        return res;
    }

    public static void msg(String m, int l){
        for(int i=0;i<l;i++){
            System.out.println(m);
        }
    }
    
}
