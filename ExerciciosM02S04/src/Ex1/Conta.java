package Ex1;

// absttract não permite que eucrie um objeto dessa classeem si
// apenas crie objetos de classes filhos dela

public abstract class Conta {
    Double saldo;

    protected Double obterSaldoAtual() {
        return saldo;
    }

//    protected abstract Double obterSaldoAtual() {}
}
