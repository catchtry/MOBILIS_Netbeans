
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


public class ClienteController {
    
    private List<EstadoVM> estados;
    private PessoaFisicaDAO pessoaFisicaDAO;
    private PessoaJuridicaDAO pessoaJuridicaDAO;
    
    public ClienteController(){
        estados = EstadoFactoryVM.TodosOsEstados();
        pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaJuridicaDAO = new PessoaJuridicaDAO();
    }
    
    public List<EstadoVM> GetEstados()
    {
        return estados;
    }
    public EstadoVM GetEstadoById(int id){
        return estados.get(id);
    }
    
    public void salvarCliente(TipoDePessoa tipoDePessoa, IClienteVM cliente){
        
        if(tipoDePessoa == TipoDePessoa.PESSOA_FISICA){
            
            pessoaFisicaDAO.criar((PessoaFisicaVM)cliente);
            
        }else{
            
            pessoaJuridicaDAO.criar((PessoaJuridicaVM)cliente);
        }
    }
    
    public IClienteVM lerCliente(TipoDePessoa tipoDePessoa, String cpf){
        
        if(tipoDePessoa == TipoDePessoa.PESSOA_FISICA){
            
            PessoaFisicaVM pessoaFisica = pessoaFisicaDAO.lerPessoaFisicaByCPF(cpf);
            return pessoaFisica;
        }else{
           
            //PessoaJuridicaVM pessoaJuridica = pessoaJuridicaDAO.lerPessoaJuridicaByCNPJ();
            //return pessoaJuridica;
        }
        
        return null;
    }
           
}
