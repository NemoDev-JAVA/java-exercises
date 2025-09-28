package Strings.exercicio23;

import java.util.Scanner;

public class exercicio23 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Sou um contador de espaços. Insira qualquer frase ou tecle qualquer coisa que te direi quantos espaços têm!");
    String frase = scan.nextLine();
    
    int countEspace = 0;
    for (char letra : frase.toCharArray()) {
      if (letra == ' ') {
        countEspace++;
      }
    }
    System.out.println("O número total de espaços é " + countEspace);
    scan.close();
  }
}
