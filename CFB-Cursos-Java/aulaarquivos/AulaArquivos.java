package aprendendojava.aulaarquivos;
import java.nio.file.*;

public class AulaArquivos {
    public static void main(String[] args) {

        Path nomeDiretorio = Paths.get("D:/Develop/GitHub/Java");

        if(Files.isDirectory(nomeDiretorio)){
            System.out.println("diretorio existe");
        } else {
            System.out.println("diretorio nao existe");
        }        
        

        Path nomeArquivo = Paths.get("D:/Develop/GitHub/Java/README.MD");

        if(Files.isDirectory(nomeArquivo)){
            System.out.println("o arquivo é um diretorio");
        } else {
            System.out.println("o arquivo NÃO é um diretorio");
        }
        

        if(Files.exists(nomeArquivo)){
            System.out.println("o arquivo existe");
        } else {
            System.out.println("o arquivo NÃO existe");
        }
        
    }
    
}
