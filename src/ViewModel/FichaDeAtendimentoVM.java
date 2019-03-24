
package ViewModel;

import java.util.ArrayList;
import java.util.List;


public class FichaDeAtendimentoVM implements IClienteVM {
    
    private IClienteVM cliente;
    private PessoaFisicaVM pessoaFisica;
    private PessoaJuridicaVM pessoaJuridica;
    private List<VeiculoVM> veiculo = new ArrayList();
    private String vendedor;
    private String origemDoContato;
    private String dataDeAbertura;
    
    private enum OrigemDeContato{
       SELECIONE, EMAIL, TELEFONE;
    }
    
    private enum ComoSoube{
       SELECIONE, FACEBOOK, PANFLETO, OUTDOOR;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getOrigemDoContato() {
        return origemDoContato;
    }

    public void setOrigemDoContato(String origemDoContato) {
        this.origemDoContato = origemDoContato;
    }

    public List<VeiculoVM> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<VeiculoVM> veiculo) {
        this.veiculo = veiculo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
