package Entities.Factories;

import Entities.Factories.BaseFactory.RelatorioFactory;
import Entities.RelatorioPDF;
import Interfaces.iRelatorio;

public class RelatorioPDFFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
