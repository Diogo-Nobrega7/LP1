// Esse código abrange todos os tópicos
import java.util.Scanner;

public class Analisador2 {
    public static void main(String[] args) {

        double numero1;
        double numero2;
        String operacao;
        // Declare and initialize 'resultado' in a single line.
        double resultado = Double.NaN;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = leitor.next();

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida. Utilize +, -, *, ou /.");
                // It's better to not assign a value here, so the check below works as intended.
                break;
        }


        if (!Double.isNaN(resultado)) {
            if (resultado > 0) {
                System.out.println("O resultado é um número positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é um número negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }
        }

        leitor.close();
    }
}