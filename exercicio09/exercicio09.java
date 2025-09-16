package exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira o valor de l e c separando os valores por espaço: ");
    Double l = scan.nextDouble(), c = scan.nextDouble();
    Double perimetro = 2 * (l + c);
    Double area = l * c;

    System.out.printf(
        "O valor do perímetro e área do retângulo são respectivamente : %.2f | %.2f%n",
        perimetro, area);
    scan.close();
  }
}
