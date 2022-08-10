package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.XPLOGFundo;
import support.DriverQA;

public class XPLOGFundoMyStepdefs extends DriverQA {
    public static XPLOGFundo xplogFundo = new XPLOGFundo(driverNavegador);
    @Quando("^escolher o Fundo XP LOG$")
    public void escolherOFundoXPLOG() {
        xplogFundo.escolherOFundoXPLOG();
    }


    @Então("^deve visualizar a tabela do fundo XP LOG$")
    public void deveVisualizarATabelaDoFundoXPLOG() {
        xplogFundo.deveVisualizarATabelaDoFundoXPLOG();
    }

    @E("^clicar na aba Documentos$")
    public void clicarNaAbaDocumentos() {
        xplogFundo.clicarNaAbaDocumentos();
    }

    @E("^clicar em Assembleias da aba documentos$")
    public void clicarEmAssembleiasDaAbaDocumentos() {
        xplogFundo.clicarEmAssembleiasDaAbaDocumentos();
    }

    @Quando("^Clicar em  XP Leroy Quarta$")
    public void clicarEmXPLeroyQuarta() {
        xplogFundo.clicarEmXPLeroyQuarta();
    }

    @E("^clicar no botao Cota$")
    public void clicarNoBotaoCota() {
        xplogFundo.clicarNoBotaoCota();
    }

    @E("^escolher Dia (\\d+) como data de inicio$")
    public void escolherDiaComoDataDeInicio(int arg0) {
        xplogFundo.escolherDiaComoDataDeInicio();
    }

    @E("^escolher Dia (\\d+) como data final$")
    public void escolherDiaComoDataFinal(int arg0) {
        xplogFundo.escolherDiaComoDataFinal();
    }

    @E("^clicar em atualizar$")
    public void clicarEmAtualizar() {
        xplogFundo.clicarEmAtualizar();
    }

    @Então("^vai visualizar o Fundo XP LOG$")
    public void vaiVisualizarOFundoXPLOG() {
        xplogFundo.vaiVisualizarOFundoXPLOG();
    }
}

