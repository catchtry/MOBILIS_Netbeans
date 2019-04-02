
package ViewModel.Cliente;


public class PessoaJuridicaVM implements IClienteVM{
    
    private String cnpj;
    private InformacaoGeralVM informacoesGerais = new InformacaoGeralVM();

    public PessoaJuridicaVM(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public InformacaoGeralVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacaoGeralVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
