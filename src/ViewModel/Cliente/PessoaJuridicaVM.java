
package ViewModel.Cliente;


public class PessoaJuridicaVM implements IClienteVM{
    
    private String cnpj;
    private InformacaoGeralVM informacoesGerais = new InformacaoGeralVM();

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public InformacaoGeralVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacaoGeralVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
