package aprendendojava.exercicio001;

abstract class Animal implements SerVivo{  
    
    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int velocidade;
    private int forca;

    public Animal(int velocidade, int massa, int forca){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.forca=forca;
        this.velocidade=velocidade;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }
    public Boolean getVivo(){
        return this.vivo;
    }
    public void setForca(int forca){
        this.forca=forca;
    }
    public int getForca(){
        return this.forca;
    }
    public void setMassa(int massa){
        this.massa=massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                //this.forca+=a.getMassa();
                a.vivo=false;
            } else{
                this.vivo=false;
            }
        }else{
            System.out.println("=======");
            System.out.println(this.getClass().toGenericString() + "esta morto, nao pode atacar");
            System.out.println("=======");
        }
    }
    public void mover(){
        if(this.vivo){
            this.x+=this.velocidade;
            this.y+=this.velocidade;
        }else{
            System.out.println("=======");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode se mover");
            System.out.println("=======");
        }
    }

   
    public void comer(int massa){
        if(this.vivo){
            this.forca+=massa;
        }else{
            System.out.println("=======");
            System.out.println(this.getClass().toGenericString() + "esta morto, nao pode comer");
            System.out.println("=======");
        }
    }
    public void info(){
        System.out.printf("Tipo: %s\n",getClass().toString());
        System.out.printf("Vivo: %s\n",this.getVivo() ? "sim" : "não");
        System.out.printf("Massa: %s\n",this.massa);
        System.out.printf("Velocidade: %s\n",this.velocidade);
        System.out.printf("Força: %s\n",this.forca);
        System.out.printf("=======================\n");
    }
    
}
