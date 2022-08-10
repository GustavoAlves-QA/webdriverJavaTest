package pages;

import org.junit.Assert;
import support.DriverQA;

public class Fundos {

    public static DriverQA driver;

    public Fundos(DriverQA stepNavegador) {
        driver = stepNavegador;
    }


    public static void clicarNaOpçaoInvestidor() {
        driver.clicar("id","investidor");
    }

    public static void clicarNaOpçãoFundosDeInvestimento() {
        driver.clicar("css", "#investidor4");
    }

    public static void vaiVisualizarAMensagemFundosDeInvestimentos() {
        String TituloAlertaFraude = driver.pegarMensagem("css","[style='display:flex;align-items:flex-end']");
        Assert.assertEquals("FUNDOS DE INVESTIMENTO",TituloAlertaFraude);
    }
}
