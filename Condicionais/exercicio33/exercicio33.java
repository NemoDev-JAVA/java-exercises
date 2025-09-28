package Condicionais.exercicio33;

import java.util.Scanner;

public class exercicio33 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira três números separados por espaço: ");
    double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    Boolean mult5 = (num1 + num2 + num3) % 5 == 0 ? true : false;

    if (mult5) {
      System.out.print("A soma dos números inseridos é divisível por 5!");
    } else {
      System.out.print("A soma dos números inseridos não é divisível por 5!");
    }

    scan.close();
  }
}
