
package Controller;

import DAL.PessoaFisicaDAO;
import DAL.PessoaJuridicaDAO;
import ViewModel.Cliente.EstadoFactoryVM;
import ViewModel.Cliente.EstadoVM;
import ViewModel.Cliente.IClienteVM;
import ViewModel.Cliente.PessoaFisicaVM;
import ViewModel.Cliente.PessoaJuridicaVM;
import ViewModel.Cliente.TipoDePessoa;
import java.util.List;


public class CadastroClienteController {
    
    private List<EstadoVM> estados;
    private PessoaFisicaDAO pessoaFisicaDAO;
    private PessoaJuridicaDAO pessoaJuridicaDAO;
    
    public CadastroClienteController(){
        estados = EstadoFactoryVM.TodosOsEstados();
    }
    
    public List<EstadoVM> GetEstados()
    {
        return estados;
    }
    public EstadoVM GetEstadoById(int id){
        return estados.get(id);
    }
    
    public void SalvarCliente(TipoDePessoa tipoDePessoa, IClienteVM cliente){
        
        if(tipoDePessoa == TipoDePessoa.PESSOA_FISICA){
            pessoaFisicaDAO = new PessoaFisicaDAO();
            pessoaFisicaDAO.criar((PessoaFisicaVM)cliente);
            
        }else{
            pessoaJuridicaDAO = new PessoaJuridicaDAO();
            pessoaJuridicaDAO.criar((PessoaJuridicaVM)cliente);
        }
    }
           
}
