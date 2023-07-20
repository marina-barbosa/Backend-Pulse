package aprendendojava.aulaarraylist;

import java.util.ArrayList;

public class AulaArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();
        //int tam;

        carros.add("HRV");      
        carros.add("Polo");      
        carros.add("Cruze");      
        carros.add(1,"Audi");      
        numeros.add(11);
        numeros.add(22);
        System.out.println(numeros);
        numeros.add(33);
             

        for(String e:carros){
            System.out.println(e);
        }
        for(int e:numeros){
            System.out.println(e);
        }

        for(int i=0;i<carros.size();i++){
            System.out.println(carros.get(i));
        }

        System.out.println(carros.indexOf("HRV"));
        carros.remove("HRV");
        carros.remove(1);
        System.out.println(carros);
        carros.clear();
        System.out.println(carros);
        
        System.out.println("===========");
        ArrayList<String> teste = new ArrayList<>(10);  
        //tam=((CharSequence) teste).length(); 
        //System.out.println(tam);     
        teste.trimToSize();
        //tam=((CharSequence) teste).length(); 
        //System.out.println(tam); 
        

        

    }

    
}