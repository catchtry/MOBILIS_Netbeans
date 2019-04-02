
package ViewModel.Cliente;

public enum TipoDePessoa {
    
   FISICA("Fisica"), 
   JURIDICA("Juridica");

  private String descricao;

  TipoDePessoa(String descricao) {
      this.descricao = descricao;
  }

  public String getDescricao() {
      return descricao;
  }

    @Override
    public String toString() {
        return descricao;
    }
   
  
}
