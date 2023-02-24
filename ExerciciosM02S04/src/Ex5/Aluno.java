package Ex5;

// private só permite acesso dentro da propria classe.
// public permite acesso em qualquer lugar.
// protected permite acesso para classes dentro do mesmo pacote.
// Para acessar algo protected fora do mesmo pacote, é necessário que
// a classe que está fora herde a outra classe.

// Algo que não tenha sua visibilidade determinada, pode ser acessado
// apenas por classes que estão dentro do mesmo pacote.

public class Aluno extends Pessoa {

    private String matricula;


    public String registrar(String nomeCompleto) {
//        return "Sou o " + this.nome + this.sobreNome + " e minha matrícula é " + matricula;
        return "Sou o " + nomeCompleto + " e minha matrícula é " + matricula;
    }

    public Aluno(String nome, String sobrenome, String matricula) {
        super(nome,sobrenome);
        this.matricula = matricula;
    }
}
