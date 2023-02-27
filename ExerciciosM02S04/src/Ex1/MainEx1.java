package Ex1;

public class MainEx1 {

    public static void main(String[] args) {

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
