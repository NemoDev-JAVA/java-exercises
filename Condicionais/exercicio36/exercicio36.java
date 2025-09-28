package Condicionais.exercicio36;

import java.util.Scanner;

public class exercicio36 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira 3 idades separadas por espaço ");
    Double num1 = scan.nextDouble(), num2 = scan.nextDouble(), num3 = scan.nextDouble();

    Double[] idade = {num1,num2,num3};

    int maior18 = 0;
    for (int i = 0; i < idade.length; i++) {
      if (idade[i] >= 18) {
        maior18++;
      }
    }

    System.out.println("Total de usuários maior de idade é: " + maior18);

    scan.close();
  }
}
