
package ViewModel.Veiculo;


public enum Cambio {
    
    SELECIONE(0, "Selecione"), MANUAL(1, "Manual"), AUTOMATICO(2, "Automático");
    
    private int valorDoEnum;
    private String descricao;

    private Cambio(int tipo, String descricao) {

        this.valorDoEnum = tipo;
        this.descricao = descricao;
    }

    public int getValorDoEnumCorrespondenteAConstante() {
        return valorDoEnum;
    }

    //Sobrescrevendo o toString
    @Override
    public String toString() {
        return descricao;
    }
}
