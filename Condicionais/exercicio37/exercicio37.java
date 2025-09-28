package Condicionais.exercicio37;

import java.util.Scanner;

public class exercicio37 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira 3 números separados por espaço ");
    Double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    boolean verificaTriangulo = (num1 + num2 > num3) &&
        (num1 + num3 > num2) &&
        (num2 + num3 > num1);

    if (verificaTriangulo) {
      System.out.println("Baseado nos números inseridos eles podem sim ser lados de um triângulo!");
    } else {
      System.out.println("Baseado nos números inseridos eles não podem ser lados de um triângulo!");
    }

    scan.close();
  }
}
