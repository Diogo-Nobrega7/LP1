// Esse código aborda Entradas e saídas, Variaveis, Strings, Contas matemáticas e if else
import java.util.Scanner;

public class AnalisadorNota {

    public static void main(String[] args) {

        double nota1;
        double nota2;
        double media;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        leitor.close();

        media = (nota1 + nota2) / 2;

        System.out.println("A média é: " + media);


        if (media >= 7.0) {
            System.out.println("Você foi aprovado(a).");
        } else if (media >= 5.0) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}