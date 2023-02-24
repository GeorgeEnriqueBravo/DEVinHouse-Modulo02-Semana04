package Ex5;

public class Pessoa {

    protected String nome;

    protected String sobreNome;

    protected String obterNomeCompleto(String nome, String sobreNome){
        return nome + " " + sobreNome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobreNome = sobrenome;
    }

}
