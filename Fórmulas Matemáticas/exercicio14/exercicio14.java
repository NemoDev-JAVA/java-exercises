package exercicio14;

import java.util.Scanner;

public class exercicio14 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o valor dos pontos x separados por espaço");
    double x1 = scan.nextDouble(), x2 = scan.nextDouble();

    System.out.println("Insira o valor dos pontos y separados por espaço");
    double y1 = scan.nextDouble(), y2 = scan.nextDouble();

    double resultX = Math.pow((x2 - x1), 2);
    double resultY = Math.pow((y2 - y1), 2);
    double resultParenteses = resultX + resultY;

    System.out.printf("A distância entre o ponto x e o ponto y é %.2f%n ", Math.sqrt(resultParenteses));

    scan.close();
  }
}
