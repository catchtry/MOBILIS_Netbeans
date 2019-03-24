
package ViewModel;

import java.util.ArrayList;
import java.util.List;


public class FichaDeAtendimentoVM {
    
    private PessoaFisicaVM pessoaFisica;
    private PessoaJuridicaVM pessoaJuridica;
    private List<VeiculoVM> veiculo = new ArrayList();
    private String vendedor;
    private String origemDoContato;
    private String dataDeAbertura;
    
    private enum OrigemDeContato{
       SELECIONE, EMAIL, TELEFONE;
    }
    
    private enum ComoSoube{
       SELECIONE, FACEBOOK, PANFLETO, OUTDOOR;
    }
}
