package aprendendojava.testandometodos;


public class ValueOfTestando {
    public static void main(String[] args) {

      char[] arrayDeChar = {'w', 'o', 'r', 'l', 'd'};
      //int[] numeros = {1, 2, 3, 4, 5, 6};
      //int[] numeros2 = {2, 7, 6, 5, 3, 4};
      String minhaString = "Hello";
      String testeString = "";
      //char meuChar = 'z';
      char testeChar = ' ';
      System.out.println("");

       
       
      
      System.out.println("----- valueOf -------------"); 
      
      testeString = String.valueOf(arrayDeChar);
      System.out.println(testeString); // Saída: "World" 

      testeChar = String.valueOf(arrayDeChar).charAt(2);
      System.out.println(testeChar); // saida 'r'

      testeChar = String.valueOf(minhaString).charAt(3);
      System.out.println(testeChar); // saida 'l'
       
      testeString="";
      for(int i = minhaString.length()-1; i >= 0; i--){
        testeString += minhaString.charAt(i); //saida olleh        
      }
      System.out.println(testeString);
      


      

    }  
    
}
