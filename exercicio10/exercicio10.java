package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira o valor de a, b, c e h separando os valores por espaço: ");
    Double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), h = scan.nextDouble();
    Double perimetro = a + b + c;
    Double area = b * h;

    System.out.printf(
        "O valor do perímetro e área são respectivamente : %.2f | %.2f%n",
        perimetro, area);
    scan.close();
  }
}
