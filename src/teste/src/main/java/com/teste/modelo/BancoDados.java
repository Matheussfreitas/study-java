package com.teste.modelo;

public class BancoDados {
  public static void iniciaConexao() {
    //lógica
    System.out.println("Conexão com o banco de dados iniciada.");
  }

  public static void fechaConexao() {
    //lógica
    System.out.println("Conexão com o banco de dados fechada.");
  }

  public static void insereDados(Pessoa pessoa) {
    //lógica
    System.out.println("Pessoa inserida no banco de dados");
  }
  
  public static void deletaDados(Pessoa pessoa) {
    //lógica
    System.out.println("Pessoa deletada do banco de dados");
  }
}
