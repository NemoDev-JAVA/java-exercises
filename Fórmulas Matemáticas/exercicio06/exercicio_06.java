package exercicio06;

import java.util.Scanner;

public class exercicio_06 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o raio do círculo a ser calculado:");
    double r = scan.nextDouble();

    System.out.printf("O perímetro do círculo é: %.2f%n", 2 * Math.PI * r);
    scan.close();
  }
}
