package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Um Consumer em Java é uma interface funcional que aceita um único argumento e não retorna nenhum resultado, e é frequentemente usada em operações de processamento de streams e outras operações funcionais.


public class ConsumerExample {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5);

    Consumer<Integer> imprimirNumerosPares = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };

    numeros.stream().forEach(n -> {
        if (n % 2 == 0) {
          System.out.println(n);
        }
    });
  }
}
