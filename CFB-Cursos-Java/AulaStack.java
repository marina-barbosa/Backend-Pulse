package aprendendojava;

import java.util.Stack;

public class AulaStack {
    public static void main(String[] args) {
        
        Stack<String> carros = new Stack<>();

        carros.push("HRV");
        carros.push("Audi");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Tiggo 3x");
        
        
        System.out.println(carros);
        System.out.println("Peek() - Topo da pilha: " + carros.peek());

        for(int i=1; i<4 ; i++){
            System.out.println(i);
            System.out.println("Pop() - Topo da pilha: " + carros.pop());
            System.out.println(carros);
        }

        System.out.println("Empty()");
        System.out.println(carros.empty() ? "Pilha vazia" : "Pilha com elementos"); 

        System.out.println("clear()");
        carros.clear();
        System.out.println(carros.empty() ? "Pilha vazia" : "Pilha com elementos");
        System.out.println(carros);
    }    
}
