package Strings.exercicio17;

import java.util.Scanner;

public class exercicio17_withforeach {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma palavra");
    String palavra = scan.next();

    for (char letra : palavra.toCharArray()) {
      System.out.println(letra);
    }

    scan.close();
  }
}
