
package ViewModel.Cliente;

public class ClienteFactoryVM {
    
    public IClienteVM instanciarClienteConformeOTipoDePessoa(TipoDePessoa tipoDePessoa, String cpf_cnpj) {
        if (tipoDePessoa == TipoDePessoa.FISICA) {
            return new PessoaFisicaVM(cpf_cnpj); 
        } else if (tipoDePessoa == TipoDePessoa.JURIDICA) {
            return new PessoaJuridicaVM(cpf_cnpj);
        } else {
            return null;
        }
    }
}

