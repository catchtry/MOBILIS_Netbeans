package ViewModel.Veiculo;

public enum CategoriaDoVeiculo {

    SELECIONE(0, "Selecione"), CONVERSIVEL_CUPE (1, "Conversível/Cupê"), HATCH(2, "Hatch"), 
    LEVE(3, "Leve"), MONOVOLUME(4, "Monovolume"), PICAPES(5, "Picapes"), SEDA(6, "Sedã"),
    UTILITARIO_ESPORTIVO(7, "Utilitário Esportivo"), VAN(8, "Van"), WAGNON_PERUA(9, "Wagon/Perua");
    
    private int valorDoEnum;
    private String descricao;
    
    private CategoriaDoVeiculo(int tipo, String descricao) {

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
