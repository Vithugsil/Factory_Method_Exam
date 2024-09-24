package Entities;

import Interfaces.iRelatorio;

public class RelatorioPDF implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Gerado relatorio pdf.");
    }
}
