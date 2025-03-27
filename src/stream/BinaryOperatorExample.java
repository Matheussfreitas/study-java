package stream;

import java.util.List;
import java.util.function.BinaryOperator;

//Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
//É utilizada para realizar operações de redução em pares de elementos, como somar ou combinar objetos

public class BinaryOperatorExample {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 5);

    BinaryOperator<Integer> somar = (a, b) -> a + b;

    int resultado = numeros.stream()
      .reduce(0, somar);

    System.out.println("A soma é " + resultado);  
  }
}
