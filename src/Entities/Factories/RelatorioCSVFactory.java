package Entities.Factories;

import Entities.Factories.BaseFactory.RelatorioFactory;
import Entities.RelatorioCSV;
import Interfaces.iRelatorio;

public class RelatorioCSVFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
