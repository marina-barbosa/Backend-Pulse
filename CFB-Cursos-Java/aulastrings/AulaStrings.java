package aprendendojava.aulastrings;

public class AulaStrings {
    public static void main(String[] args) {
        
        char[] texto_c={'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        String texto_s = new String("CFB Curso de Java");
        int tam;
        char c;
        char[] texto_c2 = new char[10];

        String s1=new String();
        String s2=new String("Lorem");
        String s3=new String(texto_s);
        String s4=new String(texto_c);
        String s5=new String(texto_c,0,8);

        System.out.println(texto_c);
        System.out.println(texto_s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        tam=texto_s.length();
        System.out.println(tam);        
        
        c=texto_s.charAt(2);
        System.out.println(c);

        System.out.println(texto_s);
        texto_s.getChars(4, 10, texto_c2, 0);
        System.out.println(texto_c2);




    }
    
}
