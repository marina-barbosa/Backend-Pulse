import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        
        Scanner pegar = new Scanner(System.in);
            int conta=0;
            String nome;
            String agencia;
            double saldo=0;        

            System.out.println("Por favor, digite o seu nome: ");
            nome=pegar.nextLine();

            System.out.println("Por favor, digite o numero da Agencia: ");
            agencia=pegar.nextLine();
   
            System.out.println("Por favor, digite o numero da Conta: ");
            conta=pegar.nextInt();

            System.out.println("Por favor, digite o valor do depósito: ");
            saldo=pegar.nextDouble();            
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",nome,agencia,conta,saldo);

            pegar.close();  
        
    }
}