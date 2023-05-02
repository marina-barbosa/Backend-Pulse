
package aprendendojava;
import java.util.Scanner;

public class AulaScanner {

    public static void main(String[] args) {
        
        Scanner pegar = new Scanner(System.in);
        int nasceu=0, ano=0, res=0;
        String nome;
        int nota;
        final int MEDIA=60;

        System.out.println("Digite seu nome: ");
        nome=pegar.nextLine();

        System.out.println("Digite o ano que você nasceu: ");
        nasceu=pegar.nextInt();

        System.out.println("Digite o ano em que estamos: ");
        ano=pegar.nextInt();

        res=ano-nasceu;

        System.out.printf("%s, você tem %d anos ou vai fazer esse ano ainda.\n\n",nome,res);

        System.out.println("Digite sua nota: ");
        nota=pegar.nextInt();

        pegar.close();

        if (nota >= MEDIA) {
            System.out.printf("%s, você foi aprovada!",nome);
            
        } else {
            System.out.println("Você foi reprovada.");
            
        }

        
    }
    
}
