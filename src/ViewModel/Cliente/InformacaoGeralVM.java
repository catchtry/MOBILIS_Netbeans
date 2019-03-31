
package ViewModel.Cliente;


public class InformacaoGeralVM {
    
    private String nome;
    private EnderecoVM endereco;
    private ContatoVM contato;
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public EnderecoVM getEndereco(){
        return this.endereco;
    }
    
     public void setEndereco(EnderecoVM endereco){
        this.endereco = endereco;
    }
    
    public ContatoVM getContato(){
        return this.contato;
    }
    
    public void setContato(ContatoVM contato){
        this.contato = contato;
    }
}
