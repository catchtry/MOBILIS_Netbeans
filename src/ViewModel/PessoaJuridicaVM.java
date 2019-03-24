
package ViewModel;


public class PessoaJuridicaVM {
    
    private String cnpj;
    private InformacoesGeraisVM informacoesGerais;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public InformacoesGeraisVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacoesGeraisVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
