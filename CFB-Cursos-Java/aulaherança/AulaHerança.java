package aprendendojava.aulaherança;

public class AulaHerança {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Audi");
        Carro c2 = new Carro("Golf");
        CarroCombate c3 = new CarroCombate("ChitaGuepardo",50);
        CarroCombate c4 = new CarroCombate("Donkey",100);

        c1.setLigado(true);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c4.sofrerDano(30);
        c2.sofrerDano(5);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}
