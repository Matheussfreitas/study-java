package BancoDigital;

public class ContaCorrente extends Conta{
  /* O uso do operador SUPER faz referência direta aos métodos da 
  classe pai, ou seja, a classe Conta. Útil para reutilização de código */
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirInfos();
  }

}
