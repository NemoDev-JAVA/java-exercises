package Condicionais.exercicio34;

import java.util.Scanner;

public class exercicio34_withFor {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira três números separados por espaço: ");
    double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    double[] numeros = { num1, num2, num3 };

    // Ordenação manual (bubble sort simples)
    for (int i = 0; i < numeros.length - 1; i++) { 
      for (int j = 0; j < numeros.length - 1 - i; j++) { 
        if (numeros[j] > numeros[j + 1]) {
          double temp = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = temp;
        }
      }
    }

    System.out.println("Números em ordem crescente:");
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }

    scan.close();
  }
}
