/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

/**
 *
 * @author lais.lopes
 */
public class PessoaFisicaVM {
    
    private String cpf;
    private InformacoesGeraisVM informacoesGerais;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public InformacoesGeraisVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacoesGeraisVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
