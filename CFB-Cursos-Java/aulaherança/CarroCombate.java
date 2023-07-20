package aprendendojava.aulaherança;

public class CarroCombate extends Carro{  //CARRO FILHO CLASSE FILHO
    
    private final int MAX_ARMAMENTO =100;
    private final int MIN_ARMAMENTO =0;
    private int qtddArmamento=0;

    public CarroCombate(String nome, int blindagem){
        super(nome); //<-obrigatorio pois a classe Carro pede nome no construtor
        super.setArmamento(true);
        super.setBlindagem(blindagem); //para chamar metodos da classe pai use 'super'
        this.qtddArmamento=100;
    }
    public void setQtddArmamento(int qtddArmamento){
        this.qtddArmamento+=qtddArmamento;
        if(this.qtddArmamento > MAX_ARMAMENTO){
            this.qtddArmamento = MAX_ARMAMENTO;
        }
        if(this.qtddArmamento < MIN_ARMAMENTO){
            this.qtddArmamento = MIN_ARMAMENTO;
        }
        
    }
    public int getQtddArmamento(){
        return this.qtddArmamento;
    }
    public void atirar(){
        if(this.qtddArmamento > MIN_ARMAMENTO){
            setQtddArmamento(-1);
        } else{
            System.out.println("Sem munição");
        }
    }
    public void info(){
        super.info();
        System.out.printf("Qtdd.Arm....:%d\n",this.qtddArmamento);
        
    }
}
