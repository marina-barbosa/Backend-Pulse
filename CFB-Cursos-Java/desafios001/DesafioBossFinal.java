package aprendendojava.desafios001;

public class DesafioBossFinal {
    public static void main(String[] args) {      



        System.out.println("\n===================================");

        //String[] itensColetados = new String[5];
        String[] itensColetados = {"pocao","cajado","espada","escudo","pele","pocao"};
        String itemNecessario1 = "espada";
        String itemNecessario2 = "escudo";
        String itemNecessario3 = "pocao";
        boolean itemUmObtido = false;
        boolean itemDoisObtido = false;
        boolean itemTresObtido = false;
        
        

        for(int i=0 ; i < itensColetados.length ; i++){
            if(itensColetados[i] == itemNecessario1){
                itemUmObtido = true;
            } 

            if(itensColetados[i] == itemNecessario2){
                itemDoisObtido = true; 
            }

            if(itensColetados[i] == itemNecessario3){
                itemTresObtido = true;
                
            }

        }

        if (itemUmObtido && itemDoisObtido && itemTresObtido){
            System.out.println("Pode enfrentar!");
        } else {
            System.out.println("Não pode enfrentar");
        }
    }
}

            

        

    
    

