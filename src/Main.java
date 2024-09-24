import Entities.Factories.RelatorioCSVFactory;
import Entities.Factories.RelatorioEXCELFactory;
import Entities.Factories.RelatorioPDFFactory;
import Services.RelatorioService;

public class Main {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();
        service.imprimir(new RelatorioCSVFactory());
        service.imprimir(new RelatorioPDFFactory());
        service.imprimir(new RelatorioEXCELFactory());
    }
}