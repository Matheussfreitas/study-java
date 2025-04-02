package BancoDigital;

public class Main {
  public static void main(String[] args) {
    Cliente matheus = new Cliente("Matheus");

    ContaCorrente contaMatheus = new ContaCorrente(matheus);
    contaMatheus.depositar(1000);
    contaMatheus.sacar(500);
    contaMatheus.imprimirExtrato();
    
  }
}
