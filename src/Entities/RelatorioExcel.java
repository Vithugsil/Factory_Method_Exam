package Entities;

import Interfaces.iRelatorio;

public class RelatorioExcel implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerado relatório EXCEL.");
    }
}
