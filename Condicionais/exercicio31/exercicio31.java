package Condicionais.exercicio31;

import java.util.Scanner;

public class exercicio31 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira dois números menores do que 10 separados por espaço: ");
    double num1 = scan.nextDouble(), num2 = scan.nextDouble();

    if (num1 < 0 || num1 > 10 || num2 < 0 ||num2 > 10) {
      System.out.println("O número deve ser maior que zero e menor que 10!");
      return;
    }

    Boolean nota1 = num1 >= 6 ? true : false;
    Boolean nota2 = num2 >= 6 ? true : false;

    if (nota1 && nota2) {
      System.out.println("Baseado nas notas o aluno foi aprovado!");
    } else if (!nota1 && nota2) {
      System.out.println("Baseado nas notas o aluno foi reprovado na prova 1!");
    } else if (nota1 && !nota2) {
      System.out.println("Baseado nas notas o aluno foi reprovado na prova 2!");
    } else {
      System.out.println("Baseado nas notas o aluno foi reprovado em ambas as provas!");
    }

    scan.close();
  }
}
