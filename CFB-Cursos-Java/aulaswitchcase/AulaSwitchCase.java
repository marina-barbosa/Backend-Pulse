package aprendendojava.aulaswitchcase;

public class AulaSwitchCase {
    public static void main(String[] args) {
        //int posicao=5;
        int n1,n2,res;
        String op="*";

        n1=10;n2=5;res=0;

        switch (op) {
            case "+":
                res=n1+n2;
                System.out.printf("%s\n","...");
                break;
                case "-":                
                res=n1-n2;
                System.out.printf("%s\n","...");
                break;
                case "*":
                res=n1*n2;
                System.out.printf("%s\n","...");              
                break;        
                case "/":
                res=n1/n2;
                System.out.printf("%s\n","...");              
                break;        
            default:
                System.out.printf("Operação: %s\n","Operação inválida");              
                break;
                
        }
        System.out.printf("Operacao: %s \nResultado: %d\n",op,res);
    }
    
}
