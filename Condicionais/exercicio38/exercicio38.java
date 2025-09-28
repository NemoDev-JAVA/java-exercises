package Condicionais.exercicio38;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class exercicio38 {
  public static void main(String[] args) {
    //Aprendendo a usar fazer conta com data
    Scanner scan = new Scanner(System.in);
    System.out.println(
        "Insira a sua data de nascimento no formato brasileiro (dd/MM/yyyy) ou americano (yyyy-MM-dd):");
    String nascimento = scan.nextLine().trim();

    if (nascimento == null || nascimento.isEmpty()) {
      System.out.println("Data não informada!");
      scan.close();
      return;
    }

    LocalDate dataNascimento = null;

    try {
      DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      dataNascimento = LocalDate.parse(nascimento, brFormatter);
    } catch (DateTimeParseException e) {
      try {
        String ajustado = nascimento.replace("/", "-");
        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dataNascimento = LocalDate.parse(ajustado, usFormatter);
      } catch (DateTimeParseException ex) {
        System.out.println("Formato de data inválido. Use dd/MM/yyyy ou yyyy-MM-dd.");
        scan.close();
        return;
      }
    }

    LocalDate dataAtual = LocalDate.now();
    LocalDate idadeVoto = dataAtual.minusYears(16);
    Boolean podeVotar = dataNascimento.isAfter(idadeVoto);

    if (podeVotar) {
      System.out.println("Pode votar!");
    } else {
      System.out.println("Não pode votar!");
    }

    scan.close();
  }
}
