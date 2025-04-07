package com.teste.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
  private String nome;
  private LocalDate dataNascimento;

  public Pessoa(String nome, LocalDate dataNascimento) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
  }
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
  }
  public boolean isMaiorDeIdade() {
    return getIdade() >= 18;
  }
}
