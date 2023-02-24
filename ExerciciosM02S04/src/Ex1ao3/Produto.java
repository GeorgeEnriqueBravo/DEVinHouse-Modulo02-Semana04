package Ex1ao3;

import Ex1ao3.Tributavel;

public class Produto implements Tributavel {
    Double valor;
    Double valorImposto;

    @Override
    public Double calcularValorComImposto() {
        return valor + valorImposto;
    }
}
