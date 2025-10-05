package Condicionais.exercicio42;

import java.util.Scanner;

public class exercicio42 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira a sua altura (em metros): ");
    double altura = scan.nextDouble();

    System.out.print("Insira o seu peso (em kg): ");
    double peso = scan.nextDouble();

    double imc = peso / Math.pow(altura, 2);

    System.out.printf("Seu IMC é: %.2f%n", imc);

    if (imc < 18.5) {
      System.out.println("Abaixo do peso");
    } else if (imc >= 18.5 && imc <= 24.9) {
      System.out.println("Peso normal");
    } else if (imc >= 25 && imc <= 29.9) {
      System.out.println("Sobrepeso");
    } else if (imc >= 30 && imc <= 34.9) {
      System.out.println("Obesidade Grau I");
    } else if (imc >= 35 && imc <= 39.9) {
      System.out.println("Obesidade Grau II");
    } else if (imc >= 40) {
      System.out.println("Obesidade Grau III");
    }

    scan.close();
  }
}
