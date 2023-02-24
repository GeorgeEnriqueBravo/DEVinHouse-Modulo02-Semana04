package Ex1ao3;

public class ContaCorrente extends Conta implements Operavel {

    @Override
    public void depositar(Double valor) {
        saldo = valor;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }
}
