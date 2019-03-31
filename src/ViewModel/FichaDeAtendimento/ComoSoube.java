package ViewModel.FichaDeAtendimento;

public enum ComoSoube {

    SELECIONE(0, "Selecione"), FACEBOOK(1, "Facebook"), PANFLETO(2, "Panfleto"), OUTDOOR(3, "Outdoor");

    private int valorDoEnum;
    private String descricao;

    private ComoSoube(int tipo, String descricao) {

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
