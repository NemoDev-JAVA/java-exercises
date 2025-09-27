package Strings.exercicio21;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio21_withSort {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira duas palavras separadas por espaço:");
    String[] palavras = scan.nextLine().toLowerCase().split(" ");

    if (palavras.length != 2) {
      System.out.println("Por favor, insira exatamente duas palavras.");
      scan.close();
      return;
    }

    String p1 = palavras[0];
    String p2 = palavras[1];

    if (p1.length() != p2.length()) {
      System.out.printf("'%s' não é um anagrama de '%s'%n", p2, p1);
      scan.close();
      return;
    }

    char[] c1 = p1.toCharArray();
    char[] c2 = p2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

    if (Arrays.equals(c1, c2)) {
      System.out.printf("'%s' é um anagrama de '%s'%n", p2, p1);
    } else {
      System.out.printf("'%s' não é um anagrama de '%s'%n", p2, p1);
    }

    scan.close();
  }
}
