package Bootcamp;

public abstract class Conteudo {
  /* O modificador protected faz com que o atributo
  seja acessível para todas as classes filhas */
  protected static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  public abstract double calcularXP();

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
