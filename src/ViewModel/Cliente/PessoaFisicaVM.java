
package ViewModel.Cliente;


public class PessoaFisicaVM implements IClienteVM{
    
    private String cpf;
    private InformacaoGeralVM informacoesGerais = new InformacaoGeralVM();
    
    public PessoaFisicaVM(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;  
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public InformacaoGeralVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacaoGeralVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
