package Condicionais.exercicio29;

import java.util.Scanner;

public class exercicio29 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira um número: ");
    double num1 = scan.nextDouble();

    if (num1 % 2 == 0) {
      System.out.println("O número inserido é par");
    } else {
      System.out.println("O número inserido é ímpar");
    }

    scan.close();
  }
}
