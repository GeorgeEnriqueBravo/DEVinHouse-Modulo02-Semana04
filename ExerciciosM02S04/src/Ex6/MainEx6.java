package Ex6;

public class MainEx6 {

    public static void main(String[] args) throws TamanhoInvalidoException {

        Teste teste = new Teste();
        Teste teste2 = new Teste();

        teste.validar("lalala", 6);
        teste2.validar("lalala", 5);

    }
}
