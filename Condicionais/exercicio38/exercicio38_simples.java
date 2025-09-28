package Condicionais.exercicio38;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio38_simples {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira o ano do seu nascimento: ");
    int anoNascimento = scan.nextInt();

    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
    Boolean podeVotar = anoAtual - anoNascimento >= 16 ? true : false;

    if (podeVotar) {
      System.out.println("Pode votar!");
    } else {
      System.out.println("Não pode votar!");
    }

    scan.close();
  }
}
