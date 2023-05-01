public class AulaIfElse {

    public static void main(String[] args) {
        
        int media=60;
        int nota=70;
        int maxFaltas=10;
        int faltas=3;

        if (nota >= media && faltas <= maxFaltas){

            System.out.println("Aprovado!! *-*");
            
        } else if(nota >= 40){

            System.out.println("Recuperacao x.x");
            
        } else {

            System.out.println("Reprovado :c");
        }


        
    }

}