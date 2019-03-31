
package Controller;

import ViewModel.Cliente.EstadoFactoryVM;
import ViewModel.Cliente.EstadoVM;
import java.util.List;


public class CadastroClienteController {
    
    private List<EstadoVM> estados;
    
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
    
    public void SalvarCliente(){
        
    }
           
}
