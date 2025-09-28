package Strings.exercicio22;

import java.util.Scanner;

public class exercicio22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o seu nome completo");
    String[] nome = scan.nextLine().split(" ");

    System.out.println("O seu primeiro nome é " + nome[0]);
    scan.close();
  }
}
