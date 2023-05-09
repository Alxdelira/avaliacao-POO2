public class Conta {
  private int numero;
  private double saldo;
  private Cliente cliente;

  // Construtor
  public Conta(int numero, double saldo, Cliente cliente) {
      this.numero = numero;
      this.saldo = saldo;
      this.cliente = cliente;
  }

  // Getters e Setters
  public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}
  public int getNumero() {
      return numero;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }

  public double getSaldo() {
      return saldo;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }

  // Métodos da classe
  public void depositar(double valor) {
      saldo += valor;
  }

  public boolean sacar(double valor) {
      if (saldo >= valor) {
          saldo -= valor;
          return true;
      } else {
          return false;
      }
  }

  public void transferir(double valor, Conta destino) {
      if (sacar(valor)) {
          destino.depositar(valor);
      }
  }
}
