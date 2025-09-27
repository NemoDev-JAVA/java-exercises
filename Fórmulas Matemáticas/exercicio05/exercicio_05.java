package exercicio05;

import java.util.Scanner;

public class exercicio_05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o seu peso:");
    double peso = scan.nextDouble();

    System.out.println("Insira a sua altura:");
    double altura = scan.nextDouble();

    System.out.printf("Baseado nas informações que você forneceu o seu IMC é: %.2f%n", peso / Math.pow(altura, 2));
  }
}
