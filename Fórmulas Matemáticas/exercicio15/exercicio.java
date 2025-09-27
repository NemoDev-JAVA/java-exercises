package exercicio15;

import java.util.Scanner;

public class exercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o valor do raio");
    double r = scan.nextDouble();

    System.out.printf("O volume é %.2f%n", ((4.0 /3.0) * Math.PI * Math.pow(r, 3)));
    scan.close();
  }
}
