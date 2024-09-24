package Entities.Factories;

import Entities.Factories.BaseFactory.RelatorioFactory;
import Entities.RelatorioExcel;
import Interfaces.iRelatorio;

public class RelatorioEXCELFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
