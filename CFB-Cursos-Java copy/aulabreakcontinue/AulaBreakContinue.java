package aprendendojava.aulabreakcontinue;

public class AulaBreakContinue {
    public static void main(String[] args) {
        
        int cont1=50;
        for(int i=0; i<cont1; i++){
            if(i >= 10 && i <= 35){
                continue;
            }
            System.out.printf(" - %d",i);
        }

        System.out.println("\n===================================");

        int cont2=100;
        for(int i=0; i<cont2; i++){
            System.out.printf(" - %d",i);
            if(i >= 10){
                break;
            }
        }

        
    }
    
}
