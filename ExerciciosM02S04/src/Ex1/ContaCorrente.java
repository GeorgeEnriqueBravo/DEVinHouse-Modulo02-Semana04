package Ex1;

// extends pode apenas um
// implements pode vários seprando por |
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
