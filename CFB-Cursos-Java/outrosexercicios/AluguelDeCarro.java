public class AluguelDeCarro {
    public static void main(String[] args) {
        System.out.println(rentalCarCost(2));
        System.out.println(rentalCarCost(3));
        System.out.println(rentalCarCost(7));
        
        
        
    }
    public static int rentalCarCost(int d) {
    
    // Codewars - Your solution here
    final int CUSTO = 40;
    
    if (d >= 3 && d<7) {
      return d*CUSTO -20;
    } else if (d>=7) {
      return d*CUSTO -50;
    } else {
      return d*CUSTO;
    }
    
  }
    
}
