package Condicionais.exercicio39;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio39 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira o ano do seu nascimento: ");
    int anoNascimento = scan.nextInt();

    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
    int idade = anoAtual - anoNascimento;

    if (idade >= 16 && idade < 18 || idade >= 70) {
      System.out.println("Pode votar mas não é obrigatório!");
    } else if (idade >= 18 && idade < 70) {
      System.out.println("Voto obrigatório!");
    } else {
      System.out.println("Menor de idade!");
    }

    scan.close();
  }
}
