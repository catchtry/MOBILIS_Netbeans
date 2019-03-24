package ViewModel;

import java.util.ArrayList;
import java.util.List;

public class EstadoFactoryVM {

    public static List<EstadoVM> TodosOsEstados() {
        
        List<EstadoVM> estados = new ArrayList<>();
        EstadoVM estadoDeSaoPaulo = GetEstadoDeSaoPaulo();
        EstadoVM estadoDoParana = GetEstadoDoParana();
        EstadoVM estadoDoGoias = GetEstadoDoGoias();
        EstadoVM estadoDoPernambuco = GetEstadoDoPernambuco();
        EstadoVM estadoDoPara = GetEstadoDoPara();

        estados.add(estadoDeSaoPaulo);
        estados.add(estadoDoParana);
        estados.add(estadoDoGoias);
        estados.add(estadoDoPernambuco);
        estados.add(estadoDoPara);

        return estados;
    }

    private static EstadoVM GetEstadoDeSaoPaulo() {
        CidadeVM hortolandia = new CidadeVM("Hortolândia");
        CidadeVM campinas = new CidadeVM("Campinas");
        CidadeVM sumare = new CidadeVM("Sumaré");

        List<CidadeVM> cidadesDeSaoPaulo = new ArrayList<>();
        cidadesDeSaoPaulo.add(hortolandia);
        cidadesDeSaoPaulo.add(campinas);
        cidadesDeSaoPaulo.add(sumare);

        EstadoVM estadoDeSaoPaulo = new EstadoVM("SP", "São Paulo", cidadesDeSaoPaulo);

        return estadoDeSaoPaulo;
    }

    private static EstadoVM GetEstadoDoParana() {
        CidadeVM curitiba = new CidadeVM("Curitiba");
        CidadeVM londrina = new CidadeVM("Londrina");
        CidadeVM cascavel = new CidadeVM("Cascavel");

        List<CidadeVM> cidadesDoParana = new ArrayList<>();
        cidadesDoParana.add(curitiba);
        cidadesDoParana.add(londrina);
        cidadesDoParana.add(cascavel);

        EstadoVM estadoDoParana = new EstadoVM("PR", "Paraná", cidadesDoParana);

        return estadoDoParana;
    }

    private static EstadoVM GetEstadoDoGoias() {
        CidadeVM goiania = new CidadeVM("Goiânia");
        CidadeVM anapolis = new CidadeVM("Anápolis");
        CidadeVM trindade = new CidadeVM("Trindade");

        List<CidadeVM> cidadesDoGoias = new ArrayList<>();
        cidadesDoGoias.add(goiania);
        cidadesDoGoias.add(anapolis);
        cidadesDoGoias.add(trindade);

        EstadoVM estadoDoGoias = new EstadoVM("GO", "Goiás", cidadesDoGoias);

        return estadoDoGoias;
    }

    private static EstadoVM GetEstadoDoPernambuco() {
        CidadeVM recife = new CidadeVM("Recife");
        CidadeVM moreno = new CidadeVM("Moreno");
        CidadeVM caruaru = new CidadeVM("Caruaru");

        List<CidadeVM> cidadesDoPernambuco = new ArrayList<>();
        cidadesDoPernambuco.add(recife);
        cidadesDoPernambuco.add(moreno);
        cidadesDoPernambuco.add(caruaru);

        EstadoVM estadoDoPernambuco = new EstadoVM("PE", "Pernambuco", cidadesDoPernambuco);

        return estadoDoPernambuco;
    }

    private static EstadoVM GetEstadoDoPara() {
        CidadeVM belem = new CidadeVM("Belém");
        CidadeVM castanhal = new CidadeVM("Castanhal");
        CidadeVM maracana = new CidadeVM("Maracanã");

        List<CidadeVM> cidadesDoPara = new ArrayList<>();
        cidadesDoPara.add(belem);
        cidadesDoPara.add(castanhal);
        cidadesDoPara.add(maracana);

        EstadoVM estadoDoPara = new EstadoVM("PA", "Pará", cidadesDoPara);

        return estadoDoPara;
    }

}
