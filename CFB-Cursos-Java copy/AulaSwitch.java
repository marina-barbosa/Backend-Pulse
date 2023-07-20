package aprendendojava;


public class AulaSwitch {

    public static void main(String[] args) {
        
        int pos=3;

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar!!");
                break;
            case 2:
                System.out.println("Segundo Lugar!");
                break;
            case 3:
                System.out.println("Terceiro Lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de Participação.");
                break;
            default:
                System.out.println("Não subiu no podio.");
                break;
        }
    }
    
}
