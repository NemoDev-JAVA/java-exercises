package Condicionais.exercicio28;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class exercicio28 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Insira 3 números separados por espaço ");
    int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

    int[] valores = {num1, num2, num3};
  
    OptionalInt maior = Arrays.stream(valores).max();

    System.out.println("O maior número é " + maior.getAsInt());

    scan.close();
  }
}
