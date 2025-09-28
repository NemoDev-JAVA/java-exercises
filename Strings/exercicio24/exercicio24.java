package Strings.exercicio24;

import java.util.Scanner;

public class exercicio24 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Sou um contador de vogais. Insira qualquer frase e te direi quantas vogais têm!");
    String frase = scan.nextLine();
    String vogais = "AEIOU";
  
    int countVogais = 0;
    for (char letra : frase.toCharArray()) {
      if (vogais.contains(Character.toString(letra).toUpperCase())) {
        countVogais++;
      }
    }

    System.out.println("Você inseriu um total de " + countVogais + " vogais!");
    scan.close();
  }
}
