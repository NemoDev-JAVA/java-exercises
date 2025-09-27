package Strings.exercicio21;

import java.util.Scanner;

public class exercicio21 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira duas palavras");
    String frase = scan.nextLine();

    String[] palavra = frase.split(" ");

    if (palavra[0].length() != palavra[1].length()) {
      System.out.println(
          "A segunda palavra inserida ('" + palavra[1] + "') não é um anagrama da primeira ('" + palavra[0] + "')");
    } else {
      int confereLetras = 0;
      char[] segunda = palavra[1].toCharArray();

      for (int i = 0; i < palavra[0].length(); i++) {
        boolean letraEncontrada = false;
        for (int j = 0; j < segunda.length; j++) {
          if (palavra[0].charAt(i) == segunda[j]) {
            confereLetras++;
            segunda[j] = '\0'; 
            letraEncontrada = true;
            break;
          }
        }
        if (!letraEncontrada) {
          break; 
        }
      }

      if (confereLetras == palavra[0].length()) {
        System.out.println(
            "A segunda palavra inserida ('" + palavra[1] + "') é um anagrama da primeira ('" + palavra[0] + "')");
      } else {
        System.out.println(
            "A segunda palavra inserida ('" + palavra[1] + "') não é um anagrama da primeira ('" + palavra[0] + "')");
      }
    }

    scan.close();
  }
}
