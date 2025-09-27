package Strings.exercicio17;

import java.util.Scanner;

public class exercicio17 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma palavra");
    String palavra = scan.next();

    for (int i = 0; i < palavra.length(); i++) {
      System.out.println(palavra.charAt(i));
    }

    scan.close();
  }
}
