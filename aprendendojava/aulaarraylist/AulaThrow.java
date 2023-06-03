package aprendendojava.aulaarraylist;

import java.util.ArrayList;

public class AulaThrow {
    public static void main(String[] args) {
        
        int nota1,nota2,res;

        nota1=20;
        nota2=60;
        if(nota1 > 50){          
            throw new IllegalArgumentException("Valor de nota invalido!");
        } if(nota2 > 50){          
            throw new IllegalArgumentException("Valor de nota invalido!!!!");
        }

        res=nota1+nota2;
        System.out.println("Resultado: " + res);
        System.out.println("Fim do Programa");
        

        

    }

    
}