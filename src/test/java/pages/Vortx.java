package pages;

import org.junit.Assert;
import support.DriverQA;

public class Vortx {

    public DriverQA driver;

    public Vortx(DriverQA stepNavegador) {
        driver = stepNavegador;
    }

    public void queOUsuarioEstaNoSistemaVortx() {
        driver.startChrome();
        driver.abrirLink("https://vortx.com.br/");
    }

    public void deveClicarNoBotãoSignIn() {
        driver.clicar("id","investidor");

    }

    public void deveClicarFundos() {
        driver.clicar("css","#investidor1");
    }

    public void queOUsuarioEstaNoSiteDaVortx() {
        driver.startChrome();
        driver.abrirLink("https://vortx.com.br/");
    }

    public void deveVisualizarAMensagemDeAlertaDeFraudeDaVortx() {
        String TituloAlertaFraude = driver.pegarMensagem("css","[style='padding-bottom:10px']");
    Assert.assertEquals("ALERTA DE FRAUDE",TituloAlertaFraude);
    }
}
