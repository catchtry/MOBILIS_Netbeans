package ViewModel.VeiculoVM_Enums;

public enum CondicaoDoVeiculo {

    SELECIONE(0, "Selecione"), NOVO(1, "Novo"), USADO(2, "Usado");

    private int valorDoEnum;
    private String descricao;

    private CondicaoDoVeiculo(int tipo, String descricao) {

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
