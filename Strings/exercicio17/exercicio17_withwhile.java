package Strings.exercicio17;

import java.util.Scanner;

public class exercicio17_withwhile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma palavra");
    String palavra = scan.next();

    int i = 0;
    while (i < palavra.length()) {
      System.out.println(palavra.charAt(i));
      i++;
    }

    scan.close();
  }
}
