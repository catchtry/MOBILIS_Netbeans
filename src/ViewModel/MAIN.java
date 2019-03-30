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
public class MAIN {
    
    public static void main(String[] args) {
        IClienteVM cliente;
        cliente.getInformacoesGerais().getContato();
        if(true)
            ((PessoaFisicaVM)cliente).getCpf();
        else
            ((PessoaJuridicaVM)cliente).getCnpj();
    }
}
