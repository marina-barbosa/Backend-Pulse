package aprendendojava.aulaarquivos;

import java.nio.file.*;


public class AulaTrabalhandoComArquivos {
    public static void main(String[] args) {

        Path logoNova = Paths.get("D:/Develop/GitHub/Java/aprendendojava/Pasta de apoio para aula/Bowser_Glitched.png");
        Path logoAntiga = Paths.get("D:/Develop/GitHub/Java/aprendendojava/Pasta de apoio para aula/bowser_929.png");
        
        try {
            byte[] bytesLogoNova = Files.readAllBytes(logoNova);
            Files.write(logoAntiga, bytesLogoNova);
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("erro");
        }
    }
    
}
