package exercicio07;

import java.util.Scanner;

public class exercicio_07 {
  public static void main(String[] args) {
    // Escreva um programa que calcule a área de um círculo a partir do raio, utilizando a fórmula A = Pi(r^2)
    Scanner scan = new Scanner(System.in);

    System.out.println("insira o raio do círculo:");
    double r = scan.nextDouble();

    System.out.println("O raio do círculo é: " + Math.PI * (r * r));
    
    scan.close();
  }
}
