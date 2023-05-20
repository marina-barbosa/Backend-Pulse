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



        System.out.println("\n===================================");

        //String[] itensColetados = new String[5];
        String[] itensColetados = {"pocao","cajado","espada","escudo","pele","pocao"};
        String itemNecessario1 = "espada";
        String itemNecessario2 = "escudo";
        String itemNecessario3 = "pocao";
        int contador=0;
        

        for(int i=0 ; i < itensColetados.length ; i++){
            if(itensColetados[i] == itemNecessario1){
                contador++;
                System.out.println(contador);                

            } else if(itensColetados[i] == itemNecessario2){
                contador++;
                System.out.println(contador);

            } else if(itensColetados[i] == itemNecessario3){
                contador++;
                System.out.println(contador);
                
            }

        }

    }
    
}
