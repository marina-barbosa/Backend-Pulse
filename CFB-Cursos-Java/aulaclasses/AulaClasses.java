package aprendendojava.aulaclasses;

public class AulaClasses {
    public static void main(String[] args) {
        
        int num=0;                      //tipo, nome, recebe valor
        Jogador messi = new Jogador();  //tipo, nome, recebe valor
        Jogador cr7 = new Jogador();    //tipo, nome, recebe valor
        JogadorComParametros jp = new JogadorComParametros(3);    //tipo, nome, recebe valor, parametro
        
        System.out.println(jp);
        num=1;
        System.out.println(num);
        System.out.print(messi.num);
        System.out.println(" é valor de 'num'");
        messi.num=10; 
        System.out.print(messi.num);
        System.out.println(" é valor de 'num' alterado, pois é 'public' e pude acessar, coloque 'privado' se não quiser permitir acesso em outras classes");
        cr7.num=12;
        System.out.println(messi.num);
        System.out.println(cr7.num);
    }
    
}
