package Strings.exercicio25;

import java.util.Scanner;

public class exercicio25 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o seu nome completo");
    String[] nome = scan.nextLine().split(" ");

    String lastName = "";
    for (int i = 1; i < nome.length; i++) {
      lastName += " " + nome[i];
    }

    System.out.println("O seu sobrenome nome é" + lastName);
    scan.close();
  }
}
