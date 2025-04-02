package BancoDigital;

public class Conta implements ContaInterface{
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1000;

  private int agencia;
  private int numero;
  private double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = ++SEQUENCIAL;
    this.cliente = cliente;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  @Override
  public void transferir(double valor, ContaInterface conta) {
    if (saldo >= valor) {
      this.sacar(valor);
      conta.depositar(valor);
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  @Override
  public void imprimirExtrato() {}

  public void imprimirInfos() {
    System.out.println(String.format("Titular: %s", cliente.getNome()));
    System.out.println(String.format("Agência: %d", agencia));
    System.out.println(String.format("Número: %d", numero));
    System.out.println(String.format("Saldo: %.2f", saldo));
  }

  public int getAgencia() {
    return agencia;
  }
  public int getNumero() {
    return numero;
  }
  public double getSaldo() {
    return saldo;
  }
}
