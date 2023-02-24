package Ex4;

import java.util.Scanner;

public class MainEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean idadeInvalida;

        do {
            idadeInvalida = false;

            System.out.println("Qual a sua idade?");
            int idade = scanner.nextInt();

            try {
                verificaIdade(idade);
                System.out.println("Olá, você tem " + idade + " anos de idade!");
            } catch (IdadeInvalidaExcepetion error) {
                System.out.println("Desculpe, idade inválida!");
                idadeInvalida = true;
            }

        } while (idadeInvalida);


    }

    public static void verificaIdade(int idade) {
        if (idade < 1 || idade > 100) {
            throw new IdadeInvalidaExcepetion();
        }
    }
}
