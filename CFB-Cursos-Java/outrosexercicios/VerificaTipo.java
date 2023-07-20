public class VerificaTipo {

    public class VerificadorTipo {
        public static String verificarTipo(Object objeto) {
            if (objeto.getClass() == String.class) {
                return "É uma string!";
            } else if (objeto.getClass() == Integer.class) {
                return "É um inteiro!";
            } else if (objeto.getClass() == Character.class) {
                return "É um caractere!";
            } else {
                return "Tipo desconhecido!";
            }
        }

    public static void main(String[] args) {
        Object exemplo1 = "Olá, mundo!";
        Object exemplo2 = 42;
        Object exemplo3 = 'a';

        System.out.println(verificarTipo(exemplo1));
        System.out.println(verificarTipo(exemplo2));
        System.out.println(verificarTipo(exemplo3));
    }
}
    
}
