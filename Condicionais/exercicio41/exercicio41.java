package Condicionais.exercicio41;

import java.util.Scanner;

public class exercicio41 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira o dia da semana: ");
    String dia = scan.nextLine().toLowerCase();

    String[] diasUteis = {"segunda", "terça", "terca", "quarta", "quinta", "sexta"};
    String[] finaisDeSemana = {"sábado", "sabado", "domingo"};
    int verificaDia = 0;

    for (String item : diasUteis) {
      if (item.equals(dia) || (dia.length() >= 3 && dia.substring(0,3).equals(item.substring(0,3)))) {
        verificaDia = 1;
        break;
      }
    }

    for (String item : finaisDeSemana) {
      if (item.equals(dia) || (dia.length() >= 3 && dia.substring(0,3).equals(item.substring(0,3)))) {
        verificaDia = 2;
        break;
      }
    }

    if (verificaDia == 1) {
      System.out.println("É dia útil");
    } else if (verificaDia == 2) {
      System.out.println("Não é dia útil");
    } else {
      System.out.println("Não foi inserido nenhum dia válido");
    }

    scan.close();
  }
}