package aprendendojava;

import java.util.HashMap;

public class AulaHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> frutas = new HashMap<Integer,String>();

        frutas.put(1,"Banana");
        frutas.put(2,"Melancia");
        frutas.put(3,"Abacate");
        frutas.put(4,"Melão");
        frutas.put(5,"Abacaxi");
        frutas.put(6,"Mamão");
        frutas.put(7,"Limão");
        frutas.put(8,"Maçã");
        int tam = 0;

        System.out.println(frutas);
        for(int i=1; i < frutas.size() + 1; i++){
            System.out.println(frutas.get(i));
        }

        System.out.println(frutas);
        for(String f:frutas.values()){
            System.out.println(f);
        }

        //frutas.clear();
        System.out.println(frutas); 
        tam = frutas.size();
        for(int i=1; i < tam + 1; i++){
            System.out.println(i + " remove " + frutas.get(i));            
            frutas.remove(i);
            System.out.println(frutas);
        }
        
    }
    
}
