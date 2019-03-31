package ViewModel.Veiculo;

public enum Restricoes {

    SELECIONE(0, "Selecione"), SEM_RESTRICOES(1, "Sem Restrições"), ALIENACAO_FIDUCIARIA(2, "Alienação Fiduciária"),
    ARRENDAMENTO_MERCANTIL(3, "Arrendamento Mercantil"), RESERVA_DOMINIO(4, "Reserva de Domínio"),
    PENHOR_VEICULOS(5, "Penhor de Veículos"), OUTRAS_RESTRICOES(6, "Outras Restrições");

    private int valorDoEnum;
    private String descricao;

    private Restricoes(int tipo, String descricao) {

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
