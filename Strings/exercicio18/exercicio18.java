package Strings.exercicio18;

import java.util.Scanner;

public class exercicio18 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma frase");
    String frase = scan.nextLine();

    System.out.println(frase.replace('a', 'e'));

    scan.close();
  }
}
