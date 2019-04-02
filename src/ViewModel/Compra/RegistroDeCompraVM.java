
package ViewModel.Compra;

import ViewModel.Cliente.PessoaJuridicaVM;
import ViewModel.Cliente.PessoaFisicaVM;
import ViewModel.FichaDeAtendimento.FichaDeAtendimentoVM;
import ViewModel.Veiculo.VeiculoVM;
import java.util.List;


public class RegistroDeCompraVM {
    
    private PessoaFisicaVM pessoaFisica;
    private PessoaJuridicaVM pessoaJuridica;
    private VeiculoVM veiculo;
    private FichaDeAtendimentoVM FichaDeAtendimento;
    private AvaliacaoDoVeiculoVM avaliacaoDoVeiculo;
    private double valorDeCompra;
    private double valorDeVenda;
    public int getCodigoR;

    public FichaDeAtendimentoVM getFichaDeAtendimento() {
        return FichaDeAtendimento;
    }

    public void setFichaDeAtendimento(FichaDeAtendimentoVM FichaDeAtendimento) {
        this.FichaDeAtendimento = FichaDeAtendimento;
    }

    public AvaliacaoDoVeiculoVM getAvaliacaoDoVeiculo() {
        return avaliacaoDoVeiculo;
    }

    public void setAvaliacaoDoVeiculo(AvaliacaoDoVeiculoVM avaliacaoDoVeiculo) {
        this.avaliacaoDoVeiculo = avaliacaoDoVeiculo;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public void add(List<RegistroDeCompraVM> registrocompra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
} 
