package BancoDigital;

public interface ContaInterface {
  void depositar(double valor);

  void sacar(double valor);

  /*Passar uma interface como parametro permite realizar a operação
  com qualquer tipo de conta que implemente a interface*/
  void transferir(double valor, ContaInterface conta);

  void imprimirExtrato();
}
