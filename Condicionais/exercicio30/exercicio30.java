package Condicionais.exercicio30;

import java.util.Scanner;

public class exercicio30 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira um número: ");
    double num1 = scan.nextDouble();

    if (num1 > 0) {
      System.out.println("O número inserido é positivo");
    } else if (num1 < 0){
      System.out.println("O número inserido é negativo");
    } else {
      System.out.println("O número inserido é zero");
    }

    scan.close();
  }
}
