
package ViewModel;

import java.sql.Date;


public class VeiculoVM {
    
    private String placa;
    private String chassi;
    private int Quilometragem;
    private int lotacaoMaxima;

    private enum NumeroDePortas{
        SELECIONE, TRES, CINCO;
    }
    
    private enum TipoDeVeiculo{
        SELECIONE, MOTO, CARRO, CAMINHAO;
    }
    
    private enum Origem{
        SELECIONE, NACIONAL, IMPORTADO;
    }
    
    private String uf;
    private String renavan;
    private String cilindradas;
    private String marca;
    private Date anoDeFabricacao;
    private String modelo;
    private Date anoDoModelo;
    private String versao;
    
    private enum Categoria{
        SELECIONE, CONVERSIVEL_CUPE, HATCH, LEVE, 
        MONOVOLUME, PICAPES, SEDA, 
        UTILITARIO_ESPORTIVO, VAN, WAGNON_PERUA;
    }
    
    private String cor;
    
    private enum Combustivel{
       SELECIONE, ALCOOL, DIESEL, FLEX, 
       GASOLINA, GNV, HIBRIDO_ELETRICO, 
       MULTIFLEX_ALC_GAS_GNV;
    }
    
    private enum Cambio{
       SELECIONE, MANUAL, AUTOMATICO;
    }
    
    public String opcionais;
    
    private enum Restricoes{
       SELECIONE, SEM_RESTRICOES, ALIENACAO_FIDUCIARIA,
       ARRENDAMENTO_MERCANTIL, RESERVA_DOMINIO,
       PENHOR_VEICULOS, OUTRAS_RESTRICOES;
    }
    
    private enum CondicaoVeiculo{
       SELECIONE, NOVO, USADO;
    }

    public Date getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public Date getAnoDoModelo() {
        return anoDoModelo;
    }

    public String getChassi() {
        return chassi;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(int Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public void setAnoDeFabricacao(Date anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void setAnoDoModelo(Date anoDoModelo) {
        this.anoDoModelo = anoDoModelo;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
}
