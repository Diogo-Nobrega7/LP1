//Esse código aborda Switch, if else, Contas matematicas, strings e operadores.
import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
        double numero1, numero2, resultado;
        String operacao;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = leitor.nextDouble();

        System.out.print("Digite a operação (+ ou -): ");
        operacao = leitor.next();

        leitor.close();

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2; 
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                break;

            case "-":
                resultado = numero1 - numero2; 
                System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                break;

            default:
                System.out.println("Operação inválida. Por favor, use + ou -");
                break;
        }
    }
}