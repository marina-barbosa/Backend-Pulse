package aprendendojava.aulagetset;

public class AulaClasses {
    public static void main(String[] args) {
        
        int nump=0;
                            
        Jogador messi = new Jogador(++nump);  //tipo, nome, recebe valor, parametro
        Jogador cr7 = new Jogador(++nump);    //tipo, nome, recebe valor, parametro
        Jogador jp = new Jogador(++nump);    //tipo, nome, recebe valor, parametro        

        //testando 
        messi.setVidas(-10);
        messi.addUmaVida();
        messi.addUmaVida();
        messi.addUmaVida();
        messi.addUmaVida();
        messi.addVidas(2);
        messi.addVidas(2);
        messi.addVidas(2);
        messi.addVidasMelhorado(100);  
        messi.addUmaVida();
        messi.addUmaVida();
        
        //visualizando
        System.out.printf("Vidas do jogadoor 01: %d\n",messi.getVidas());
        System.out.printf("Vidas do jogadoor 02: %d\n",cr7.getVidas());
        System.out.printf("Vidas do jogadoor 03: %d\n",jp.getVidas());
        
        
        //System.out.println(messi.nump);
        //System.out.println(cr7.nump);
        //System.out.println(jp.nump);
        
    }
    
}
