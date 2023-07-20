package aprendendojava;
import java.util.ArrayList;
import java.util.function.Consumer;

public class AulaFunçõesLambda {
    public static void main(String[] args) {
        
        // função lambda () -> {} 

        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> dobro2 = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        //System.out.println(valores);

        valores.forEach( (v)->{ 
            dobro.add(v*2); 
            if(v%2 == 0){
                par.add(v);
            } else {
                impar.add(v);
            }
            System.out.println("Valores: " + valores);
            System.out.println("Dobros: " + dobro);
            System.out.println("Pares: " + par);
            System.out.println("Impares: " + impar);
            System.out.println("---------------------");
        } );
        
        
        Consumer<Integer> dobrar = (v)->{ dobro2.add(v*2); };
        valores.forEach(dobrar);
        
        System.out.println(dobro2);
        
    }
    
}
