package aprendendojava.desafios001;

import java.util.Scanner;

public class DesafioQuizResolução {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        final int numPerguntas=5;
        int pontoQuestao=2;

        char[] gabarito={'a','a','a','a','a'};
        String[] perguntas={"pergunta um?","pergunta dois?","pergunta tres?","pergunta4?","pergunta5?"};
        String[] alternativas={"a,b,c?","a,b,c?","a,b,c?","a,b,c?","a,b,c?",};

        char[] respostas=new char[numPerguntas];
        char resp;
        int nota=0;
        String aluno;

        System.out.println("Digite seu nome: ");
        aluno=scan.nextLine();

        for(int i=0;i<numPerguntas;i++){
            System.out.println("==========");
            System.out.printf("Pergunta %d\n",i+1);
            System.out.printf("%s\n",perguntas[i]);
            System.out.printf("%s\n",alternativas[i]);
            resp=scan.nextLine().charAt(0);
            respostas[i]=resp;
        }

        System.out.printf("%s\n","Fim da prova, confira o resultado.");
        for(int i=0;i<numPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s sua nota foi %d, você foi %s",aluno,nota,nota>=6?"aprovado.":"reprovado.");
        scan.close();
    }
    
}
