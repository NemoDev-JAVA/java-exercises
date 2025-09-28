package Condicionais.exercicio32;

import java.util.Scanner;

public class exercicio32 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira dois números menores do que 10 separados por espaço: ");
    double num1 = scan.nextDouble(), num2 = scan.nextDouble();

    if (num1 < 0 || num1 > 10 || num2 < 0 ||num2 > 10) {
      System.out.println("O número deve ser maior que zero e menor que 10!");
      return;
    }

    Boolean media = (num1 + num2) / 2 > 6;

    String resultado = media ? "Aprovado" : "Reprovado";

    System.out.println("Baseado nas notas o aluno foi: " + resultado + "!");
    scan.close();
  }
}
