public class ExemploBreakContinue {
    public static void main(String[] args) throws Exception {

        System.out.println("=======");
        for(int numero = 1; numero <= 5; numero ++) {
            if (numero < 4)                        
            System.out.println(numero);            
        }


        System.out.println("=======");
        for(int numero = 1; numero <= 5; numero ++) {
            if (numero == 3) 
            break;
            System.out.println(numero);            
        }


        System.out.println("=======");
        for(int numero = 1; numero <= 5; numero ++) {
            if (numero == 3 || numero == 4) 
            continue;
            System.out.println(numero);            
        }
    }
}
