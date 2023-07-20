package aprendendojava.outrosexercicios;

public class NumerosFibonacci {

    public static void main(String[] args) {
        int limite = 10;

        System.out.println("Sequência de Fibonacci até " + limite + ":");
        for (int i = 0; i <= limite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
