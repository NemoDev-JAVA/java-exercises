package Condicionais.exercicio45;

import java.util.Scanner;

public class exercicio45 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira dois números diferentes separados por espaço:");
    double num1 = scan.nextInt(), num2 = scan.nextDouble();

    Boolean divisivel = null;

    if (num1 % num2 == 0) {
      divisivel = true;
    } else {
      divisivel = false;
    }

    if (divisivel) {
      System.out.print("Primeiro número é divisível pelo segundo");
    } else {
      System.out.print("Primeiro número não é divisível pelo segundo");
    }
    
    scan.close();
  }
}
