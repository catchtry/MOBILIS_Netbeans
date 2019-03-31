
package ViewModel.Cliente;

import java.util.ArrayList;
import java.util.List;


public class EstadoVM {
   
    private String uf;
    private String nome;
    private List<CidadeVM> cidades = new ArrayList<>();
    
    public EstadoVM(String uf, String nome, List<CidadeVM> cidades){
        this.uf = uf;
        this.nome = nome;
        this.cidades = cidades;
    }
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CidadeVM> getListaDeCidades() {
        return cidades;
    }

    public void setListaDeCidades(List<CidadeVM> listaDeCidades) {
        this.cidades = listaDeCidades;
    }
    
    
    
}
