package Condicionais.exercicio28;

import java.util.Scanner;

public class exercicio28_withFor {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Insira 3 números separados por espaço: ");
    int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

    int[] valores = {num1, num2, num3};

    int maior = 0;
    for (int i = 0; i < valores.length; i++) {
      if (maior <= i) {
        maior = i;
      }
    }

    System.out.println("O maior número é " + maior);
    
    scan.close();
  }
}
