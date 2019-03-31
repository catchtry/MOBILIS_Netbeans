package ViewModel.Veiculo;

public enum Combustivel {

    SELECIONE(0, "Selecione"), ALCOOL(1, "Álcool"), DIESEL(2, "Diesel"),
    FLEX(3, "Flex"), GASOLINA(4, "Gasolina"), GNV(5, "GNV"),
    HIBRIDO_ELETRICO(6, "Híbrido/Elétrico"), MULTIFLEX_ALC_GAS_GNV(7, "MultiFlex (Alc, Gás, GNV)");

    private int valorDoEnum;
    private String descricao;

    private Combustivel(int tipo, String descricao) {

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
