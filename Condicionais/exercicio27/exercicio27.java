package Condicionais.exercicio27;

import java.util.Scanner;

public class exercicio27 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Insira dois números separados por espaço ");
    int num1 = scan.nextInt(), num2 = scan.nextInt();

    if (num1 > num2) {
      System.out.println("O número " + num1 + " é maior do que o número " + num2 + "!");
    } else if ( num2 > num1) {
      System.out.println("O número " + num2 + " é maior do que o número " + num1 + "!");
    } else {
      System.out.println("O número " + num1 + " é igual ao número " + num2 + "!");
    }

    scan.close();
  }
}
