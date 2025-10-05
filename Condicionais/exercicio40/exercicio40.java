package Condicionais.exercicio40;

import java.util.Scanner;

public class exercicio40 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira as três notas separadas por espaço: ");
    Double nota1 = scan.nextDouble(), nota2 = scan.nextDouble(), nota3 = scan.nextDouble();

    Double[] notas = {nota1,nota2,nota3};
    double soma = 0;
    for (Double item : notas) {
      soma += item;
    }

    if ((soma / 3) >= 7) {
      System.out.println("O aluno foi aprovado com a nota " + soma + ", parabéns!");
    } else if ((soma / 3) < 4) {
      System.out.println("O aluno foi reprovado com a nota " + soma + ".");
    } else if ((soma / 3) >= 4 && (soma / 3) < 7) {
      System.out.println("Aluno está em recuperação com a nota " + soma + ", estude mais!");
    }

    scan.close();
  }
}
