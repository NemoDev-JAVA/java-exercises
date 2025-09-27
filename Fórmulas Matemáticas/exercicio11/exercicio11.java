package exercicio11;

import java.util.Scanner;

public class exercicio11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Tive que comentar isso porque não sabia kkk. Ctrl + Shift + u e depois 394 = Δ
    System.out.println("Insira o valor do Δs e Δt separados por espaço");
    double deltaS = scan.nextDouble(), deltaT = scan.nextDouble();

    System.out.printf("A velocidade média do objeto é %.2f%n", (deltaS / deltaT));
    scan.close();
  }
}
