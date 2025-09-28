package Condicionais.exercicio34;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio34 {
  public static void main(String[] args) {
    //Infelizmente troquei o número dos exercícios e esse seria o 35 e o 35 seria o 34
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira três números separados por espaço: ");
    double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    double[] numeros = { num1, num2, num3 };
    Arrays.sort(numeros); 
    System.out.println(
        "Os números em ordem crescente -> " + Arrays.toString(numeros));

    scan.close();
  }
}
