package exercicio02;

import java.util.Scanner;

public class exercicio_2 {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);


   System.out.println("Insira o seu primeiro número:");
   double num1 = scan.nextDouble();

   System.out.println("Insira o seu segundo número");
   double num2 = scan.nextDouble();

   System.out.println("A média aritimética dos números inseridos é: " + (num1 + num2) / 2);
   scan.close();
  }
}
