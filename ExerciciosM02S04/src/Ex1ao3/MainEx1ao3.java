package Ex1ao3;

public class MainEx1ao3 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        System.out.println(funcionario.obterCargo());
        System.out.println(gerente.obterCargo());


        Produto produto = new Produto();
        produto.valor = 150.5;
        produto.valorImposto = 30.2;
        System.out.println(produto.calcularValorComImposto());


        Conta conta = new ContaCorrente();
        conta.saldo = 0.0;
        System.out.println(conta.obterSaldoAtual());

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.saldo = 0.0;
        System.out.println(contaCorrente.obterSaldoAtual());
        contaCorrente.depositar(100.0);
        contaCorrente.sacar(45.0);
        System.out.println(contaCorrente.obterSaldoAtual());

    }
}
