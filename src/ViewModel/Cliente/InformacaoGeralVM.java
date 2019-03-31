
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
    
     public void setEndereco(String cep, String logradouro, int numero, String bairro, 
                             String cidade, String uf, String complemento){
         
        endereco = new EnderecoVM();
        
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setUf(uf);
        endereco.setComplemento(complemento);
        
    }
    
    public void setContato(String telefone, String celular, String email){
        
        contato = new ContatoVM();
        
        contato.setTelefone(telefone);
        contato.setCelular(celular);
        contato.setEmail(email);
        
    }
    
    public ContatoVM getContato(){
        return this.contato;
    }
}
