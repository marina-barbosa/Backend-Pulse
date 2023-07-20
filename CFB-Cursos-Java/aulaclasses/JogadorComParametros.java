package aprendendojava.aulaclasses;

public class JogadorComParametros {

    private int nump=7979;
    
    
    public JogadorComParametros(int nump){  
        
        System.out.printf("\nJogador numero %d criado. Metodo construtor com parametro.\n",nump);

        System.out.printf("valor this nump dentro da classe: %d\n",this.nump);
        this.nump = nump; //'this' serve para referir ao 'nump' da propria classe, sem this ele se refere ao parametro nump
        System.out.printf("valor de nump FORA da classe: %d\n",nump);
        System.out.println("valores private só podem ser printados de dentro da propria classe, por fora nao se tem acesso.\n\n");
    }
}
