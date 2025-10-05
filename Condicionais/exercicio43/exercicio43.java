package Condicionais.exercicio43;

import java.util.Scanner;

public class exercicio43 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira um número inteiro: ");
    int num = scan.nextInt();

    Boolean divisivel = false;

    if (num % 3 == 0 && num % 5 == 0) {
      divisivel = true;
    }

    if (divisivel) {
      System.out.println("Número é divisível por 3 e 5");
    } else {
      System.out.println("Número não é divisível por 3 e 5");
    }

    scan.close();
  }
}
