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
public class PessoaJuridicaVM {
    
    private String cnpj;
    private InformacoesGeraisVM informacoesGerais;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public InformacoesGeraisVM getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(InformacoesGeraisVM informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }
    
    
}
