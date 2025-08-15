// Esse código aborda Entradas e saídas, Variaveis, Operadores, Contas matemáticas e if else
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        numero1 = leitor.nextInt();

        System.out.println("Digite o número 2: ");
        numero2 = leitor.nextInt();

        soma = numero1 + numero2;

        System.out.println(soma);

        if (soma % 2 == 0){
            System.out.println("A soma é par");
        } else {
            System.out.println("A soma é impar");
        }
    }
}