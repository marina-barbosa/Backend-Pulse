package aprendendojava.aulaarraylist;

import java.util.ArrayList;

public class AulaTratamentoDeErros {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");      
        carros.add("Polo");      
        carros.add("Cruze");      
        carros.add(1,"Audi");      
        numeros.add(11);
        numeros.add(22);
        //System.out.println(numeros);
        numeros.add(33);
             

        try {
            System.out.println(carros.get(10));
            
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Erro 001 x.x - " + e.getMessage());
        } catch (Exception plin) {
            // TODO: handle exception
            System.out.println("erro2 x.x - " + plin.getMessage());
        } finally {
            System.out.println("fim do try, com ou sem erros");
            
        }

        System.out.println("fim do programa");
        

        

    }

    
}