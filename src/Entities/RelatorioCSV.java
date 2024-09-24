package Entities;

import Interfaces.iRelatorio;

public class RelatorioCSV implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerado relatório CSV.");
    }
}
