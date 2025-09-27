package exercicio13;

import java.util.Scanner;

public class exercicio13 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o valor da força e distância separados por espaço");
    double f = scan.nextDouble(), d = scan.nextDouble();

    System.out.printf("O resultado do trabalho realizado é %.2f%n", (f * d));
    scan.close();
  }
}
