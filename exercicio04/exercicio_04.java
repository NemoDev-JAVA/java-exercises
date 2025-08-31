package exercicio04;

import java.util.Scanner;

public class exercicio_04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double numero1 = lerNumero(scan, "Digite o primeiro número: ");
    double numero2 = lerNumero(scan, "Digite o segundo número: ");
    double numero3 = lerNumero(scan, "Digite o terceiro número: ");

    double mediaGeometrica = calcularMediaGeometrica(numero1, numero2, numero3);

    System.out.printf("A média geométrica é: %.2f%n", mediaGeometrica);

    scan.close();
  }

  private static double lerNumero(Scanner scanner, String mensagem) {
    System.out.print(mensagem);
    return scanner.nextDouble();
  }

  private static double calcularMediaGeometrica(double a, double b, double c) {
    return Math.cbrt(a * b * c);
  }
}
