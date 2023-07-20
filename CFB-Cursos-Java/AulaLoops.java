package aprendendojava;

public class AulaLoops {
    public static void main(String[] args) {
        
        for(int conte=0 ; conte < 6 ; conte++){
            System.out.printf("Contando com FOR %d\n",conte);
        }

        int contew=0;
        while(contew < 5){
            System.out.printf("Contando com WHILE %d\n",contew);
            contew++;
        }

        int conted=0;
        do{
            System.out.printf("Contando com DOwhile %d\n",conted);
            conted++;
        }
        while(conted < 3);

    System.out.println("Fim do programa.");
    

    }

    
}
