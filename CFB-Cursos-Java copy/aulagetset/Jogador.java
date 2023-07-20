package aprendendojava.aulagetset;

public class Jogador {

    private int nump=0;
    private int vidas=0;
    private final int MAXVIDAS=5;
    
    
    public Jogador(int nump){  
        this.nump=nump;
        this.vidas=1;
        
        System.out.printf("Jogador numero %d criado.\n",this.nump);
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
    
}
