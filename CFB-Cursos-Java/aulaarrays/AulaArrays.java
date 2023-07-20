package aprendendojava.aulaarrays;

import java.util.Scanner;

public class AulaArrays {

    public static void main(String[] args) {
        
        final int tam=5;
        char[] respostas=new char[tam];
        char[] gabarito={'b','c','e','d','c'};
        String[] perguntas={"Qual a cor do Yoshi?","Qual a cor dos olhos do Mario?","Qual a cor da gravata do Donkey Kong?","Qual a cor do cabelo do Link?","Qual a cor do Megaman?"};
        int nota=0;
        Scanner scan=new Scanner(System.in);
        String alternativas = "a) Branco\nb) Verde\nc) Azul\nd) Amarelo\ne) Vermelho\n";
    

        for(int i=0; i<tam; i++){
            System.out.println("\n\n\n"+perguntas[i]);
            System.out.println(alternativas);
            System.out.println("Digite a alternativa correta:");
            respostas[i]=scan.nextLine().charAt(0);
            

        }

        for(int i=0;i<tam;i++){
            if(respostas[i]==gabarito[i]){
                nota=nota+2;
            }

        scan.close();
        
        }

        System.out.printf("Sua nota é: %d",nota);

    }
    
}
