package aprendendojava.exercicio001;

public class Aranha extends Animal{
    private int veneno;
    public Aranha (int velocidade, int massa, int forca, int veneno){
        super(velocidade, massa, forca);
        this.veneno=veneno;
    }
    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            if(this.getForca() <= a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                //this.setForca(this.getForca()+a.getMassa());
                a.setVivo(false);
            }else{
                this.setVivo(false);
            }
        }else{
            System.out.println("=======");
            System.out.println("este animal esta morto, nao pode atacar");
            System.out.println("=======");
        }
    }
    
}
