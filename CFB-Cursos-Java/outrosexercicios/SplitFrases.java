package aprendendojava.outrosexercicios;

public class SplitFrases {
    public static void main(String[] args) {

        String frase = "Robin Singh say: I love arrays they are my favorite";
        String[] umaArray = new String[20];       

        umaArray = frase.split(" ");

        for(int i=0; i<umaArray.length; i++){
            if(i==0){
                System.out.print(umaArray[i]);
            } else {
                System.out.print(", " + umaArray[i]);
            }
            
        }
        System.out.print(".");
    }
    
}
