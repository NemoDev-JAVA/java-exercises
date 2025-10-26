import java.util.ArrayList;

public class exercicio49 {
  public static void main(String[] args) {
    ArrayList<Integer> pares = new ArrayList<>();
    ArrayList<Integer> impares = new ArrayList<>();

    for (int i = 50; i <= 100; i++) {
      if (i % 2 == 0) {
        pares.add(i);
      } else {
        impares.add(i);
      }
    }

    // Exibe os pares
    System.out.println("Números pares:");
    for (int num : pares) {
      System.out.print(num + " ");
    }

    System.out.println("\n\nNúmeros ímpares:");
    for (int num : impares) {
      System.out.print(num + " ");
    }
  }
}
