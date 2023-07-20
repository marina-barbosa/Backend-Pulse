package aprendendojava.aulaprotected;

public class AulaProtected {
    public static void main(String[] args) {
        
        Aviao v1 = new Aviao("Voador", 1);

        v1.info();

    }
    
}

// PUBLIC: Quando um membro é declarado como público (public), ele pode ser acessado de qualquer lugar, tanto dentro da classe em que está definido quanto em qualquer outra classe que tenha uma instância dessa classe. Isso significa que o membro público é visível e acessível para qualquer parte do programa.

// PRIVATE: Quando um membro é declarado como privado (private), ele só pode ser acessado dentro da classe em que está definido. Isso significa que o membro privado não é visível ou acessível a outras classes ou partes do programa. A ideia por trás do encapsulamento é ocultar os detalhes internos e implementações da classe, fornecendo acesso controlado por meio de métodos públicos.

// PROTECTED: Quando um membro é declarado como protegido (protected), ele é semelhante ao membro privado, mas com uma exceção: ele também pode ser acessado por classes derivadas (subclasses) da classe em que está definido. Isso permite que as classes derivadas herdem e acessem membros protegidos da classe base. O acesso a membros protegidos é restrito a classes relacionadas por herança.

// Em resumo, a diferença entre public, private e protected está na visibilidade e no acesso aos membros da classe. Public permite acesso amplo, private restringe o acesso somente à própria classe e protected permite acesso também por classes derivadas. Esses modificadores de acesso são importantes para garantir a encapsulação e a segurança dos dados em um programa orientado a objetos.
