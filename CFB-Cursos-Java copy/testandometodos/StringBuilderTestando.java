package aprendendojava.testandometodos;

public class StringBuilderTestando {
  public static void main(String[] args) {

    //char[] arrayDeChar = {'w', 'o', 'r', 'l', 'd'};
    //int[] numeros = {1, 2, 3, 4, 5, 6};
    //int[] numeros2 = {2, 7, 6, 5, 3, 4};
    String minhaString = "Hello"; 
    String testeString = " ";     
    //char meuChar = 'z';
    //char testeChar = ' ';
    System.out.println("");       
      
    
    StringBuilder testeSB = new StringBuilder(minhaString.length()); 
    
    for (int i = (minhaString.length() - 1); i >= 0; i--){
      testeSB.append(minhaString.charAt(i));      
    }
    System.out.println(minhaString);
    System.out.println(testeSB);



    System.out.println("----- teste sb2 ----");   
    
    StringBuilder testeSB2 = new StringBuilder();
    testeSB2.append(minhaString);
    System.out.println(testeSB2);
    System.out.println(new StringBuilder(testeSB2).reverse().toString());



    System.out.println("----- teste sb3 ----");

    StringBuilder testeSB3 = new StringBuilder();
    System.out.println(new StringBuilder(testeSB3).append(minhaString).reverse());



    ////////////////////////////////////////////////////////////////////////

    System.out.println("----- teste rightpad e captalização ----");
    
    testeString = "romora";
    System.out.println(convertAndRightPad(testeString) + ".");
    


    
    
  }  
  
  public static String convertAndRightPad(String str) {
      if (str == null || str.trim().isEmpty()) {
          return rightPad("", 12);
      } else {
          String firstChar = str.substring(0, 1).toUpperCase();
          String remainingChars = str.substring(1);
          String convertedString = firstChar + remainingChars;
          return rightPad(convertedString, 12);
      }
  }

  public static String rightPad(String str, int size) {
      if (str.length() >= size) {
          return str;
      } else {
          StringBuilder sb = new StringBuilder(str);
          while (sb.length() < size) {
              sb.append(" ");
          }
          return sb.toString();
      }
  }
    
}
