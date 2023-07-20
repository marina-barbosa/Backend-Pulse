package aprendendojava;

public class AulaClasseMath {
    public static void main(String[] args) {
        
        int n1,n2;
        double v1,v2,v3,v4;

        v1=64;
        v2=-3;  
        n2=-50;
        /*
        pow() potencia
        cos() cosseno
        sin() seno        
        tan() tangente
        exp() expoente
        floor() valor inteiro mais proximo
        log() logaritmo
        nextUp() proximo maior
        round() arredondar
        toDegrees() convertar para graus
        toRadians() converter para radianos
        */  
           

        System.out.println("raiz quadrada de v1: " + Math.sqrt(v1));

        System.out.println("Valora absoluto de v2: " + Math.abs(v2));
        System.out.println("Valora absoluto de v2: " + Math.abs(n2));

        for(int i=0; i<6; i++){
            n1=(int) (Math.random()*60);            
            v3=Math.random()*60;
            v4=Math.floor(v3);
            System.out.println(n1);
            System.out.println(v3);
            System.out.println(v4);
            System.out.println("------------------");
        }
    }

    
    
}
