package Strings.exercicio20;

import java.util.Scanner;

public class exercicio20 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma palavra");
    String palavra = scan.next();

    String palindromo = "";
    Boolean verificaPalindromo = false;

    for (int i = palavra.length() - 1; i >= 0; i--) {
      palindromo += palavra.charAt(i);
    }

    verificaPalindromo = palavra.equals(palindromo);

    if (verificaPalindromo) {
      System.out.println("A palavra inserida é um palíndromo! \n" + palavra);
    } else {
      System.out.println("A palavra inserida não é um palíndromo! \n" + palavra);
    }

    scan.close();
  }
}
