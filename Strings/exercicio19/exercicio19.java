package Strings.exercicio19;

import java.util.Scanner;

public class exercicio19 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma frase");
    String frase = scan.nextLine();

    if (frase.charAt(0) == 'A' || frase.charAt(0) == 'a') {
      System.out.println("A frase inserida começa com a letra A! \n" + frase);
    } else {
      System.out.println("A frase inserida não começa com a letra A! \n" + frase);
    }

    scan.close();
  }
}
