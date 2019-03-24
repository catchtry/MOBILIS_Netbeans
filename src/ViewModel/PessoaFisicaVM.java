
package ViewModel;


public class PessoaFisicaVM implements IClienteVM{
    
    private String cpf;
    private InformacaoGeralVM informacoesGerais;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public InformacaoGeralVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacaoGeralVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
