
package Controller;

import DAL.PessoaFisicaDAO;
import DAL.PessoaJuridicaDAO;
import ViewModel.Cliente.ClienteFactoryVM;
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
    private ClienteFactoryVM clienteFactory;
    
    public ClienteController(){
        estados = EstadoFactoryVM.TodosOsEstados();
        pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaJuridicaDAO = new PessoaJuridicaDAO();
        clienteFactory = new ClienteFactoryVM();
    }
    
    public List<EstadoVM> GetEstados()
    {
        return estados;
    }
    public EstadoVM GetEstadoById(int id){
        return estados.get(id);
    }
    
    public void salvarCliente(TipoDePessoa tipoDePessoa, IClienteVM cliente){
        
        if(tipoDePessoa == TipoDePessoa.FISICA){
            pessoaFisicaDAO.criar((PessoaFisicaVM)cliente);
        }
        if(tipoDePessoa == TipoDePessoa.JURIDICA){
            pessoaJuridicaDAO.criar((PessoaJuridicaVM)cliente);
        }
    }
    
    public IClienteVM lerCliente(TipoDePessoa tipoDePessoa, String cpf_cnpj){
        
        if(tipoDePessoa == TipoDePessoa.FISICA){
            return pessoaFisicaDAO.lerPessoaFisicaByCPF(cpf_cnpj);
        }
        if(tipoDePessoa == TipoDePessoa.JURIDICA){
            return pessoaJuridicaDAO.lerPessoaJuridicaByCNPJ(cpf_cnpj);
        }
        
        return null;
    }
    
    
    public void atualizarCliente(TipoDePessoa tipoDePessoa,IClienteVM cliente){
        if(tipoDePessoa == TipoDePessoa.FISICA){
            pessoaFisicaDAO.atualizar((PessoaFisicaVM)cliente);
        }
        if(tipoDePessoa == TipoDePessoa.JURIDICA){
            pessoaJuridicaDAO.atualizar((PessoaJuridicaVM)cliente);
        }
    }
    
    
}
