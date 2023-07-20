package aprendendojava.aulaarrays;

public class AulaArrayTipoPersonalizado {
    public static void main(String[] args) {
        
        final int numCarros=5;
        Carro[] carros = new Carro[numCarros];
        String[] nomesCarros={"Audi","Golf","Camaro","Mustang","Toro"};
        

        //inicializar o array carros
        for(int i=0; i<numCarros; i++){
            //System.out.println(i+nomesCarros[i]);
            carros[i] = new Carro(nomesCarros[i]);            
        }

        for(String s:nomesCarros){
            System.out.println(s);
        }

        //imprimir info carros
        for(Carro c:carros){
            c.info();
        }
    }
}
