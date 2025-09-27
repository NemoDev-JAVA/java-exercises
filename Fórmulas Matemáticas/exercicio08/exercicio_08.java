package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira o valor de b, a e c separando os valores por espaço: ");
    Double b = scan.nextDouble(), a = scan.nextDouble(), c = scan.nextDouble();

    System.out.printf("O resultado da equação de segundo grau é: %.2f%n", Math.pow(b, 2) - (4 * a * c));
    scan.close();
  }
}
