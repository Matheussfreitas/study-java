package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Representa uma função que aceita um argumento do tipo T e retorna um valor booleano(true/false)
//É utilizada para filtrar os elementos do Stream

public class PredicateExample {
  public static void main(String[] args) {
    List<String> linguagens = Arrays.asList("java", "kotlin", "javascript", "python", "ruby");

    Predicate<String> maiorQueCinco = lang -> lang.length() > 5;

    linguagens.stream()
      .filter(maiorQueCinco)
      .forEach(System.out::println);
  }
}
