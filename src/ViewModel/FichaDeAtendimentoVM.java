
package ViewModel;

import java.util.ArrayList;
import java.util.List;


public class FichaDeAtendimentoVM{
    
    private IClienteVM cliente;
    private List<VeiculoVM> veiculo = new ArrayList();
    private String vendedor;
    private String origemDoContato;
    private String dataDeAbertura;
    private int origemDeContato;
    private int comoSoube;
    
    public FichaDeAtendimentoVM(IClienteVM cliente){
        this.cliente = cliente;
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

    public int getComoSoube() {
        return comoSoube;
    }

    public void setComoSoube(int comoSoube) {
        this.comoSoube = comoSoube;
    }

    public void setOrigemDeContato(int origemDeContato) {
        this.origemDeContato = origemDeContato;
    }

    public int getOrigemDeContato() {
        return origemDeContato;
    }
    
    
}
