package pages;

import org.junit.Assert;
import support.DriverQA;

public class XPLOGFundo {

    public static DriverQA driver;

    public XPLOGFundo (DriverQA stepNavegador) {
        driver = stepNavegador;
    }



    public void escolherOFundoXPLOG() {
        driver.esperarElementoCssClicar("[value='FII - XP LOG FUNDO DE INVESTIMENTO IMOBILIARIO  ']");


    }

    public void deveVisualizarATabelaDoFundoXPLOG() {
        driver.esperarElementoCss("h2");
        String XPTabela = driver.pegarMensagem("css","h2");
        Assert.assertEquals("FII - XP LOG FUNDO DE INVESTIMENTO IMOBILIARIO",XPTabela);
    }

    public void clicarNaAbaDocumentos() {
        driver.esperarElementoIdClick("2");
    }

    public void clicarEmAssembleiasDaAbaDocumentos() {
        driver.esperarElementoCssClicar("#Assembleias");
    }

    public void clicarEmXPLeroyQuarta() {
        driver.esperarElementoCssClicar("[href='https://vx.vortx.com.br/Upload/EncontrarArquivoPublico?nomeDocumento=FII - XP Log - 26502194 - Fato Relevante - 20200723 - Compra Espec 3 Tranche .pdf&codigoDocumento=81377']");
//        driver.DownloadClicar("[href='https://vx.vortx.com.br/Upload/EncontrarArquivoPublico?nomeDocumento=FII - XP Log - 26502194 - Fato Relevante - 20200723 - Compra Espec 3 Tranche .pdf&codigoDocumento=81377']");
    }

    public void clicarNoBotaoCota() {
        driver.esperarElementoCssClicar("[viewBox='0 0 512 512']");
    }

    public void escolherDiaComoDataDeInicio() {
        driver.esperarElementoCssClicar("[placeholder='Data início']");
        driver.esperarElementoCssClicar("[aria-label='Choose Sunday, August 7th, 2022']");
    }

    public void escolherDiaComoDataFinal() {
        driver.esperarElementoCssClicar("[placeholder='Data final']");
        driver.esperarElementoCssClicar("[aria-label='Choose Wednesday, August 10th, 2022']");


    }

    public void clicarEmAtualizar() {
        driver.esperarElementoCssClicar("[style='margin-bottom: 0px; margin-left: 4%; display: block;']");
    }

    public void vaiVisualizarOFundoXPLOG() {
        driver.esperarElementoCss(".td-emissor");
    }
}
