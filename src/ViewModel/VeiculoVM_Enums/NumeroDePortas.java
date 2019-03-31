
package ViewModel.VeiculoVM_Enums;


public enum NumeroDePortas {
    
    SELECIONE(0, "Selecione"), TRES(1, "3"), CINCO(2, "5");

    private int valorDoEnum;
    private String descricao;

    private NumeroDePortas(int tipo, String descricao) {

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
