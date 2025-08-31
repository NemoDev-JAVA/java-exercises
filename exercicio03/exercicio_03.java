package exercicio03;

import java.util.Scanner;

public class exercicio_03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a primeira nota:");
    double nota1 = scan.nextDouble();

    System.out.println("Insira a segunda nota:");
    double nota2 = scan.nextDouble();

    System.out.println("Insira a terceira nota:");
    double nota3 = scan.nextDouble();

    System.out.println("A média aritimética das 3 notas é: " + (nota1 + nota2 + nota3) / 3);
    scan.close();
  }
}
