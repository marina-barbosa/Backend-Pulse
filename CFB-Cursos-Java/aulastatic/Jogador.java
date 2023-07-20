package aprendendojava.aulastatic;

public class Jogador {

    private int nump=0;
    private int vidas=0;
    private final int MAXVIDAS=5;
    static boolean alerta=false;
    static int qtddJogadores=0;
    static int pontosJogadores=0;
    //int pontoIndividual=0;
    
    
    public Jogador(int nump){  
        this.nump=nump;
        this.vidas=1;
        
        qtddJogadores++;
        System.out.printf("Jogador numero %d criado. Total de jogadores: %d\n",this.nump,Jogador.qtddJogadores);
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas){
        this.vidas+=vidas;
    }

    public void addVidas(int vidas){ 
        if (vidas >= MAXVIDAS) {
            this.vidas=MAXVIDAS;            
        } else if (vidas<0) {   
            this.vidas = 0; //ou seja, n faz nada
        } else {
            this.vidas+=vidas;
            if (this.vidas>= MAXVIDAS){
                this.vidas=MAXVIDAS; 
            }
        }
    }

    public void addVidasMelhorado(int vidas){
        this.vidas+=vidas;
        if(this.vidas<0){
            this.vidas=0;
        } else if(this.vidas>MAXVIDAS){
            this.vidas=MAXVIDAS;
        } 
    }
    public void addUmaVida(){
        if(this.vidas < MAXVIDAS) {
            this.vidas++;
        }
    }

    public void info(){
        System.out.printf("------------------------------------\n");
        System.out.printf("Jogador %d.\n",this.nump);
        System.out.printf("Vidas %d.\n",this.vidas);
        System.out.printf("Alerta: %s.\n",alerta ? "sim" : "nao");
        System.out.printf("Jogadores: %d.\n",qtddJogadores);
        System.out.printf("Pontos jogadores: %d\n",pontosJogadores);
    }

    public void pontos(){
        pontosJogadores+=10;
    }
    
}
