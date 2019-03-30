
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
        SELECIONE, MOTO(2), CARRO, CAMINHAO;
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
    
    
    
}
