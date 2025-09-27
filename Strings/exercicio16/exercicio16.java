package Strings.exercicio16;

import java.util.Scanner;

public class exercicio16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira duas palavras separadas por espaço: ");
    String frase = scan.nextLine();

    String[] palavras = frase.split(" ");

    System.out.println("A palavra inserida pelo usuário é: " + palavras[0] + " " + palavras[1]);

    scan.close();
  }
}
