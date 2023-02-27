package Ex4;

// extends RuntimeException é unchecked, ou seja, não precisa ser tratada
// extends Exception é checked, ou seja, precisa ser tratada (try / catch)

public class IdadeInvalidaExcepetion extends RuntimeException {

    public IdadeInvalidaExcepetion() {
//        System.out.println("Entrou na IdadeInvalidaExcepetion");
    }
}
