package aprendendojava;

public class PraticandoPrint {

    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        int res=num1+num2;
        String palavra="teste OK";

        System.out.print("Praticando os tipos de \"prints\".\n");
        System.out.print(">>o comando print não tem quebra de linha automatica.\n");
        System.out.print("testando print com string: " + palavra +"\n");
        System.out.println(">>o comando println tem quebra de linha automatica no final.");
        System.out.println("testando println com string: " + palavra);
        System.out.print("testando print com int: " + num1);
        System.out.println("\ntestando println com int: " + num1);
        System.out.printf(">>o comando printf tem formatação mais facilitada. Exemplos:\n");
        System.out.printf("a soma de %d mais %d é igual a: %d. %s.\n",num1,num2,res,palavra);
        System.out.println("se fosse com println seria(olhe no código):");
        System.out.println("a soma de "+num1+" mais "+num2+" é igual a: "+res+". "+palavra+".");
        System.out.println("mais exemplos de formação(olhe no código):");

        String nome1="Claudio";
        int idade1=46;
        double salario1=10400.456;

        String nome2="Senna";
        int idade2=31;
        double salario2=3300.1565;

        String nome3="Derci";
        int idade3=101;
        double salario3=6000.755;

        System.out.printf("Nome: %10s, Idade: %3d, Salário: %9.2f\n",nome1,idade1,salario1);
        System.out.printf("Nome: %10s, Idade: %3d, Salário: %9.2f\n",nome2,idade2,salario2);
        System.out.printf("Nome: %10s, Idade: %3d, Salário: %9.2f\n",nome3,idade3,salario3);
        
    }
}
