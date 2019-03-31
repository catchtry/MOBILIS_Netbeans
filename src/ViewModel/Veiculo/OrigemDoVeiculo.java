
package ViewModel.Veiculo;


public enum OrigemDoVeiculo {
    
    SELECIONE(0, "Selecione"), NACIONAL(1, "Nacional"), IMPORTADO(2, "Importado");
        
    private int valorEnum;
    private String descricao; 
    
    OrigemDoVeiculo(int tipo, String descricao){
        this.valorEnum = tipo;
        this.descricao = descricao;
    }
    
    public int getValorDoEnumCorrespondenteAConstante() {
        return valorEnum;
    }
    
    //Sobrescrevendo o toString
    @Override
    public String toString() {
        return descricao;
    }
    
}
