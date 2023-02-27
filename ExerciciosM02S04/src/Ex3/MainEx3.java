package Ex3;

public class MainEx3 {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.valor = 150.5;
        produto.valorImposto = 30.2;
        System.out.println(produto.calcularValorComImposto());
    }
}
