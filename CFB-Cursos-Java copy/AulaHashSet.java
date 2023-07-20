package aprendendojava;

import java.util.HashSet;

public class AulaHashSet {
    public static void main(String[] args) {
        
        HashSet<String> frutas = new HashSet<String>();

        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Melancia");
        frutas.add("Limão");
        frutas.add("Limão");
        frutas.add("Limão");
        frutas.add("Limão"); //obs

        System.out.println(frutas);

        System.out.println("tem limão? " + (frutas.contains("Limão") ? "sim" : "nao"));
        System.out.println("tem melão? " + (frutas.contains("Melão") ? "sim" : "nao"));

        System.out.println("add limao? " + (frutas.add("Limão") ? "--sim" : "--nao, ja tem"));
        System.out.println("add melao? " + (frutas.add("Melão") ? "--sim" : "--nao, ja tem"));

        System.out.println(frutas);

        frutas.remove("Limão");
        System.out.println(frutas);

        frutas.clear();
        System.out.println(frutas);
        
    }
    
}
