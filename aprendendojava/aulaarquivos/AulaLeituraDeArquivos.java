package aprendendojava.aulaarquivos;
//import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class AulaLeituraDeArquivos {                                         
    public static void main(String[] args) /*throws IOException*/ { 

        Path nomeArquivo = Paths.get("D:/Develop/GitHub/Java/aprendendojava/ArquivoTexto.txt");        
         
        try {
            if(Files.exists(nomeArquivo)){
                System.out.println("o arquivo existe");
            } else {
                System.out.println("o arquivo NÃO existe");
            }

            List<String> linhas = Files.readAllLines(nomeArquivo);

            for(String li:linhas){
                System.out.println(li);
            }

            linhas.forEach(li -> System.out.println(li));

        } catch(Exception e) {
            System.out.println("Erro 001");
        }
    }
    
}
