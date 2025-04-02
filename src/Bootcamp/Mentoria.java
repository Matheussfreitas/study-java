package Bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
  
  private LocalDate dataMentoria;
  
  @Override
  public double calcularXP() {
    return XP_PADRAO + 20d;
  } 

  /* Devido os atributos serem privates, deve-se referencia-los 
  usando os métodos getters */
  @Override
  public String toString() {
    return "Mentoria {" +
           "titulo='" + getTitulo() + '\'' +
           ", descricao='" + getDescricao() + '\'' +
           ", dataMentoria=" + dataMentoria +
           '}';
  }
}
