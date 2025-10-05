package Condicionais.exercicio44;

import java.util.Scanner;

public class exercicio44 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira a sua idade: ");
    int idade = scan.nextInt();

    if (idade > 0 && idade <= 12) {
      System.out.print("Criança");
    } else if (idade >= 13 && idade <= 17) {
      System.out.print("Adolescente");
    } else if (idade >= 18 && idade <= 59) {
      System.out.print("Adulto");
    } else if (idade >= 60) {
      System.out.print("Idoso");
    }
      
    scan.close();
  }
}
