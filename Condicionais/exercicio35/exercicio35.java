package Condicionais.exercicio35;

import java.util.Scanner;

public class exercicio35 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira 3 números separados por espaço ");
    Double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    Double soma = num1 + num2 + num3;

    if (soma > 0) {
      System.out.print("A soma dos números é positiva!");
    } else if (soma < 0) {
      System.out.print("A soma dos números é negativa!");
    } else {
      System.out.print("A soma dos números é zero!");
    }

    scan.close();
  }
}
