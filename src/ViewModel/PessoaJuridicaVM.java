
package ViewModel;


public class PessoaJuridicaVM {
    
    private String cnpj;
    private InformacaoGeralVM informacoesGerais;

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
