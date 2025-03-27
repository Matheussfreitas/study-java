package stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
// É usada para criar ou fornecer novos objetos de um determinado tipo
public class SupplierExample {
  public static void main(String[] args) {
    Supplier<String> saudacao = () -> "Olá, mundo!";

    List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo")
      .limit(5)
      .collect(Collectors.toList());

    listaSaudacoes.forEach(System.out::println);
  }
}
