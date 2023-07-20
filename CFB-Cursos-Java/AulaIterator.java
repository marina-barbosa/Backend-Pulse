package aprendendojava;
import java.util.ArrayList;
import java.util.Iterator;

 
public class AulaIterator {
    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<String>();

        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Limão");  
        frutas.add("Melancia");

        System.out.println(frutas);        

        //System.out.println(frutas.iterator().next());

        Iterator<String> nomeIt = frutas.iterator();
        System.out.println(nomeIt.next());
        //System.out.println(nomeIt.next());

        System.out.println("=== w ===");

        while(nomeIt.hasNext()){
            String f=nomeIt.next();
            System.out.println(f);
            if (f == "Limão"){
                nomeIt.remove();
            }
        }
        System.out.println(frutas);
        
    }
    
}
