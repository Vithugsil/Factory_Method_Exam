package Services;

import Entities.Factories.BaseFactory.RelatorioFactory;

public class RelatorioService {
    public void imprimir(RelatorioFactory factory)
    {
        factory.criarRelatorio().gerar();
    }
}
