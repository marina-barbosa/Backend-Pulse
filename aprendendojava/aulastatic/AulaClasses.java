package aprendendojava.aulastatic;

public class AulaClasses {
    public static void main(String[] args) {
        
        int nump=0;
        
        System.out.printf("\nAlerta: %s",Jogador.alerta);
        System.out.printf("\nAlerta: %s",Jogador.alerta ? "sim" : "não\n");
        //posso acessar o alerta da classe jogador sem necessidade de antes instanciar um objeto/jogador dessa classe, pois o alerta é static , e atributos ou propriedades static vao ser iguais para todos objetos
                            
        Jogador messi = new Jogador(++nump);  //tipo, nome, recebe valor, parametro
        Jogador cr7 = new Jogador(++nump);    //tipo, nome, recebe valor, parametro
        Jogador jp = new Jogador(++nump);    //tipo, nome, recebe valor, parametro        

        //testando  
        
        messi.pontos();
        jp.pontos();
        jp.pontos();
        messi.info();
        Jogador.alerta=true;            
        cr7.info();
        jp.info();
        //visualizando
        
        
        
        
    }
    
}
