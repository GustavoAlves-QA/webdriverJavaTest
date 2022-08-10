package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import pages.Fundos;
import pages.Fundos;
import support.DriverQA;

public class FundosMyStepdefs extends DriverQA {
    public static Fundos fundos = new Fundos(driverNavegador);

    @Dado("^clicar na opção investidor$")
    public void clicarNaOpçaoInvestidor() {
        fundos.clicarNaOpçaoInvestidor();
    }

    @E("^clicar na opção Fundos de Investimento$")
    public void clicarNaOpçãoFundosDeInvestimento() {
        fundos.clicarNaOpçãoFundosDeInvestimento();

    }

    @Então("^vai visualizar a mensagem Fundos de investimentos$")
    public void vaiVisualizarAMensagemFundosDeInvestimentos() {
        fundos.vaiVisualizarAMensagemFundosDeInvestimentos();
    }
}
