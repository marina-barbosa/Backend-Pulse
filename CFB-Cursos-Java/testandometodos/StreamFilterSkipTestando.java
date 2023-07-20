package aprendendojava.testandometodos;

import java.util.Arrays;

public class StreamFilterSkipTestando {
    public static void main(String[] args) {

      //char[] arrayDeChar = {'w', 'o', 'r', 'l', 'd'};
      int[] numeros = {1, 2, 3, 4, 5, 6};
      int[] numeros2 = {2, 7, 6, 5, 3, 4};
      //String minhaString = "Hello";
      //String testeString = "";
      //char meuChar = 'z';
      //char testeChar = ' ';
      System.out.println("");

       
      System.out.println("----- stream, filter -------------");
      Arrays.stream(numeros)
              .filter(n -> n % 2 == 0) // Filtra apenas os números pares
              .forEach(System.out::println);
      System.out.println("--");
      Arrays.stream(numeros)
              .filter(n -> n == 4) // Filtra apenas o número 4
              .forEach(System.out::println);

      System.out.println("----- stream, skip ---------------");

      Arrays.stream(numeros)
              .skip(2) // Skipa os dois primeiros
              .forEach(System.out::println);

      System.out.println("----- stream, sorted -------------");

      
      Arrays.stream(numeros2).sorted().forEach(System.out::println);
      System.out.println("--");
      Arrays.stream(numeros2).forEach(System.out::println); 

    }  
    
}
