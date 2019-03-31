package ViewModel.FichaDeAtendimento;

public enum OrigemDeContato {

    SELECIONE(0, "Selecione"), EMAIL(1, "E-mail"), TELEFONE(2, "Telefone");

    private int valorDoEnum;
    private String descricao;

    private OrigemDeContato(int tipo, String descricao) {

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
