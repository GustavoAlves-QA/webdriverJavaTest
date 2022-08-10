package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pages.Vortx;
import support.DriverQA;

public class VortxMyStepdefs extends DriverQA {
    public static Vortx vortx = new Vortx(driverNavegador);


    @Dado("^que o usuario esta no site da Vortx$")
    public void queOUsuarioEstaNoSiteDaVortx() {
        vortx.queOUsuarioEstaNoSiteDaVortx();

    }

    @Entao("^deve visualizar a mensagem de Alerta de Fraude da Vortx$")
    public void deveVisualizarAMensagemDeAlertaDeFraudeDaVortx() {
        vortx.deveVisualizarAMensagemDeAlertaDeFraudeDaVortx();
    }
}
