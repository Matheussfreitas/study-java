package Bootcamp;

import java.time.LocalDate;

public class Bootcamp {
  private String nome;
  private String descricao;
  private LocalDate inicio;
  private LocalDate fim;

  public Bootcamp(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
    this.inicio = LocalDate.now();
    this.fim = inicio.plusDays(60);
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public LocalDate getInicio() {
    return inicio;
  }
  public void setInicio(LocalDate inicio) {
    this.inicio = inicio;
  }
  public LocalDate getFim() {
    return fim;
  }
  public void setFim(LocalDate fim) {
    this.fim = fim;
  }
}
