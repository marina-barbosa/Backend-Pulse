package aprendendojava;

public class AulaIfElse {

    public static void main(String[] args) {
        
        int media=60;
        int nota=70;
        int maxFaltas=10;
        int faltas=3;
        String humor;
        int humor2;



        if (nota >= media && faltas <= maxFaltas){

            System.out.println("Aprovado!! *-*");
            
        } else if(nota >= 40){

            System.out.println("Recuperacao x.x");
            
        } else {

            System.out.println("Reprovado :c");
        }

        System.out.println("Você está feliz? ");
        humor=(nota >= media ? "Sim" : "Não");             /* operação ternaria,atalho pra ifelse */
        System.out.println(humor);

        humor2=(nota >= media ? 1 : 0);
        System.out.println("Você esta mesmo feliz? "+ (humor2==1 ? "Sim!" : "Não!"));


    }

}