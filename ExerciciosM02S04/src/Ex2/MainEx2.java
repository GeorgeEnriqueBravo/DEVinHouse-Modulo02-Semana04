package Ex2;

public class MainEx2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        System.out.println(funcionario.obterCargo());
        System.out.println(gerente.obterCargo());
    }
}
