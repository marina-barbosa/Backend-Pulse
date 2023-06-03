package aprendendojava.aulastrings;

public class AulaStringsMetodosDeComparaçao {
    public static void main(String[] args) {
        
        
        String s1=new String("Lorem");
        String s2=("Lorem");
        String s3=new String("Curso de Java");
        String s4=new String("cbf cursos de java");
        String s5=new String("CBF Cursos de Java");
        String s6=("Lorem");
        String s7=("wyz");
        String s8=("abcdef");        

        String a1,a2,a3,a4,a5;
        
        
        if(s1 == s2){
            System.out.println("s1 é igual s2");
        } else {
            System.out.println("s1 é diferente s2");
        }

        if(s6 == s2){
            System.out.println("s6 é igual s2");
        } else {
            System.out.println("s6 é diferente s2");
        }

        if(s1.equals(s2)){
            System.out.println("s1 é igual s2");
        } else {
            System.out.println("s1 é diferente s2");
        }

        if(s4.equals(s5)){
            System.out.println("s4 é igual s5");
        } else {
            System.out.println("s4 é diferente s5");
        }
        
        if(s4.equalsIgnoreCase(s5)){
            System.out.println("s4 é igual s5");
        } else {
            System.out.println("s4 é diferente s5");
        }

        System.out.println(s1.compareTo(s2)); //igual retorna 0
        
        System.out.println(s4.compareTo(s5)); // iguais com case maior
        System.out.println(s5.compareTo(s4)); // iguais com case menor

        System.out.println(s7.compareTo(s8));  // tem caracteres a mais
        System.out.println(s8.compareTo(s7));  // tem caracteres a menos


         if(s3.regionMatches(true, 9, s4, 14, 4)){
            System.out.println("s3 é igual s4");
        } else {
            System.out.println("s3 é diferente s4");
        }
//ignorecase//inicio//inicio do parametro//numero de caracteres a ser comparado
        if(s4.regionMatches(true, 14, s5, 14, 4)){
            System.out.println("s4 é igual s5");
        } else {
            System.out.println("s4 é diferente s5");
        }      
        
        a1="Curso de Java";
        a2="Uma PARTE da frase";
        a3="Java cursos";
        a4="     trim     trim trim     trim remove espaço do começo ou fim        ";
        

        System.out.println("=== startswith / endswith ===");
        System.out.println(a1);                    
        System.out.println("começa com c: " + ((a1.startsWith("c")) ? "sim" : "não"));  //nao ignora case
        System.out.println("termina com Java: " + ((a1.endsWith("Java")) ? "sim" : "não"));

        System.out.println("===");
        System.out.println("termina ou começa com Java: " + (a1.startsWith("Java") || a1.endsWith("Java")));  //nao ignora case
        System.out.println("termina ou começa com Java: " + (a3.startsWith("Java") || a3.endsWith("Java")));  //nao ignora case

        System.out.println("=== indexOf ===");
        System.out.println(a1.indexOf(2));
        System.out.println(a1.indexOf('d'));
        System.out.println(a1.indexOf("de"));
        System.out.println(a1.indexOf('a'));
        System.out.println(a1.indexOf("a",11));

        System.out.println("=== substring ===");
        System.out.println(a2);
        System.out.println(a2.substring(3));
        System.out.println(a2.substring(3, 12));

        System.out.println("=== concat ===");
        System.out.println(a2.concat(a3));
        System.out.println(a2+a3);
        String a23=a2+a3;
        System.out.println(a23);

        System.out.println("=== replace ===");
        System.out.println(a2.replace("a", "4"));
        System.out.println(a3.replace('s', 'z'));

        System.out.println("=== toLowerCase / toUpperCase ===");
        System.out.println(a2.toLowerCase());
        System.out.println(a2.toUpperCase()); 

        System.out.println("=== trim ===");
        System.out.println(a4.trim());

        System.out.println("=== toCharArray ===");
        char[] umaArray=a3.toCharArray();
        System.out.println(a3);
        System.out.println(a3.getClass());
        System.out.println(a3.getClass().getSimpleName());
        System.out.println(umaArray);
        System.out.println(umaArray.getClass());
        System.out.println(umaArray.getClass().getSimpleName());



        System.out.println("=== split ==="); 
        a5="Robin Singh: I love arrays they are my favorite";
        String[] a6=a5.split(" ");
        for(String s:a6){
            System.out.print(s);
            System.out.print(", ");
        }

        System.out.println("===");


    }
    
}
