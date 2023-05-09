public class Cliente {
  private String nome;
  private Endereco endereco;

  // Construtor
  public Cliente(String nome, Endereco endereco) {
    this.nome = nome;
    this.endereco = endereco;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
