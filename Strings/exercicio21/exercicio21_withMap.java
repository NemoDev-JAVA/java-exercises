package Strings.exercicio21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio21_withMap {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira duas palavras separadas por espaço:");
    String[] palavras = scan.nextLine().toLowerCase().split(" ");

    String p1 = palavras[0];
    String p2 = palavras[1];

    if (p1.length() != p2.length()) {
      System.out.printf("'%s' não é um anagrama de '%s'%n", p2, p1);
      scan.close();
      return;
    }

    Map<Character, Integer> freqP1 = new HashMap<>();
    for (char c : p1.toCharArray()) {
      freqP1.put(c, freqP1.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> freqP2 = new HashMap<>();
    for (char c : p2.toCharArray()) {
      freqP2.put(c, freqP2.getOrDefault(c, 0) + 1);
    }

    if (freqP1.equals(freqP2)) {
      System.out.printf("'%s' é um anagrama de '%s'%n", p2, p1);
    } else {
      System.out.printf("'%s' não é um anagrama de '%s'%n", p2, p1);
    }

    scan.close();
  }
}
