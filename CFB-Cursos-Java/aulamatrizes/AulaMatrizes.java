package aprendendojava.aulamatrizes;

import java.security.SecureRandom;

public class AulaMatrizes {
    public static void main(String[] args) {
        
        //int[][] primeiraMatriz=new int[3][5];
        final int linha=3;
        final int coluna=6;
        int[][] numeros=new int[linha][coluna];

        for(int li=0;li<linha;li++){
            for(int co=0;co<coluna;co++){
                numeros[li][co]=new SecureRandom().nextInt(500);
            }
        }
        
        impDados(numeros,linha,coluna);

        gerarDados(numeros,linha,coluna);
        impDados(numeros,linha,coluna);

    }


    public static void impDados(int[][] mtz, int linhas, int colunas){
        for(int li=0;li<linhas;li++){
            for(int co=0;co<colunas;co++){
                System.out.printf("%d . ",mtz[li][co]);                
            }
            System.out.println("\n");
        }

    }

    public static void gerarDados(int[][] mtz, int linhas, int colunas){
        for(int li=0;li<linhas;li++){
            for(int co=0;co<colunas;co++){
                mtz[li][co]=new SecureRandom().nextInt(59);                
            }
            System.out.println("\n");
        }

    }

    
    
}
