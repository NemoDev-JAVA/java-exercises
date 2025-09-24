package exercicio12;

import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o valor de massa e velocidade separados por espaço");
    double m = scan.nextDouble(), v = scan.nextDouble();

    double result = (m * (Math.pow(v, 2))) / 2;

    System.out.printf("O resultado da energia cinética de um objeto em movimento é %.2f%n", result);
    scan.close();
  }
}
