package aprendendojava;

import java.util.LinkedList;
import java.util.Queue;

public class AulaQueue {
    public static void main(String[] args) {
        
        Queue<String> carros = new LinkedList<>();

        carros.add("HRV");
        carros.add("Audi");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Tiggo 3x");
        
        
        System.out.println(carros);
        System.out.println("Peek() - " + carros.peek());

        for(int i=1; i<4 ; i++){
            System.out.println(i);
            System.out.println("Poll() - " + carros.poll());
            System.out.println(carros);
        }

        System.out.println("Empty()");
        System.out.println(carros.isEmpty() ? "Fila vazia" : "Fila com elementos"); 

        System.out.println("clear()");
        carros.clear();
        System.out.println(carros.isEmpty() ? "Fila vazia" : "Fila com elementos");
        System.out.println(carros);
    }    
}
