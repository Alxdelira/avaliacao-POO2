public class Principal {
  public static void main(String[] args) {
    // Criando endereços
    Endereco enderecoCliente1 = new Endereco("Marechal Rondon", 2502, "Alto dos Parecis", "Vilhena", "RO",
        "25.285-000");
    Endereco enderecoCliente2 = new Endereco("Presidente Naser", 4525, "Centro", "Vilhena", "RO", "78.852-025");

    // Criando clientes
    Cliente cliente1 = new Cliente("Mateus de Moraes", enderecoCliente1);
    Cliente cliente2 = new Cliente("Professor Lucas", enderecoCliente2);

    // Criando contas
    Conta contaCliente1 = new Conta(1, 1000.00, cliente1);
    Conta contaCliente2 = new Conta(2, 40000.00, cliente2);

    // Realizando operações na conta do cliente1
    contaCliente1.depositar(500.00);
    contaCliente1.sacar(200.00);

    // // Realizando operações na conta do cliente2
    contaCliente2.depositar(1000.00);
    contaCliente2.sacar(300.00);

    // Transferindo dinheiro da conta do cliente2 para a conta do cliente1
    contaCliente2.transferir(500, contaCliente1);

    System.out.println("Valor da conta de Mateus: " + contaCliente1.getSaldo());
    System.out.println("Valor da conta de Professor Lucas: " + contaCliente2.getSaldo());
  }
}
