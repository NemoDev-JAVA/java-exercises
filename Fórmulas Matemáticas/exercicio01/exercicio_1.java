package exercicio01;

import java.util.Scanner;

public class exercicio_1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira algum número:");
    double num1 = scan.nextDouble();

    System.out.println("Insira o seu segundo número:");
    double num2 = scan.nextDouble();

    if (num1 > 0 && num2 > 0) {
    System.out.println("A soma dos números inseridos é: " + (num1 + num2) +
        "\nA subtração dos valores inseridos é: " + (num1 - num2) +
        "\nA multiplicação dos valores inseridos é: " + (num1 * num2) +
        "\nA divisão dos valores inseridos é: " + (num1 / num2));
    } else {
      System.out.println("Não existe divisão por zero!");
    }
        
    scan.close();
  }
}
