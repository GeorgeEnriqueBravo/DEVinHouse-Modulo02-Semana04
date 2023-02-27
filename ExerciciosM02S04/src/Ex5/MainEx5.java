package Ex5;

public class MainEx5 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Bia", "Alcântara");

        String nomePessoa = pessoa.obterNomeCompleto(pessoa.nome, pessoa.sobreNome);

        System.out.println(nomePessoa);



        Aluno aluno = new Aluno("João", "Almeida", "123");

        String nomeCompleto = aluno.obterNomeCompleto(aluno.nome, aluno.sobreNome);

        System.out.println(aluno.registrar(nomeCompleto));
    }

}
