package desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosexception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void contar(int primeiroParametro, int segundoParametro) {
        if (primeiroParametro > segundoParametro)
            throw new ParametrosInvalidosexception("O primeiro parâmetro é maior que o segundo. Tente novamente!");

        int contagem = segundoParametro - primeiroParametro;
        for (int index = 0; contagem > index; index++) {
            System.out.println("N° " + index);
        }
    }
}
