package support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class DriverQA {

    public static DriverQA driverNavegador = new DriverQA();
    public WebDriver driver;

    public void startChrome() {
        // Responsavel por pegar o arquivo chrome driver na nuvem (inserimos a dependencia bonigarcia no pom)
        WebDriverManager.chromedriver().setup();

        // Aqui são as opções de manipulacao do navegador google chrome
        ChromeOptions optionsC = new ChromeOptions();
        // Sao as opcoes que eu quero tirar ou colocar do navegador, por exemplo tirar os popups indesejados
        optionsC.addArguments(Arrays.asList(
                "disable-infobars", "ignore-certificate-errors", "disable-popup-blocking",
                "disable-notifications", "no-sandbox"));

        // Iniciar o navegador

        driver = new ChromeDriver(optionsC);

        // maximar a tela dps de aberta
        driver.manage().window().maximize();

    }

    public void abrirLink(String link){
    System.setProperty("webdriver.chrome.driver","C:\\Intellij\\chromedriver_win32 (3)\\chromedriver.exe");
    driver.get(link);
        // aqui estou abrindo o link que eu quero


    }

    public WebElement encontrarElemento(String tipo, String elemento) {

        WebElement elementoEncontrado = null;

        if (tipo.equals("id")) {
            elementoEncontrado = driver.findElement(By.id(elemento));
        }
        if (tipo.equals("name")) {
            elementoEncontrado = driver.findElement(By.name(elemento));
        }
        if (tipo.equals("class")) {
            elementoEncontrado = driver.findElement(By.className(elemento));
        }
        if (tipo.equals("css")) {
            elementoEncontrado = driver.findElement(By.cssSelector(elemento));
        }
        if (tipo.equals("link")) {
            elementoEncontrado = driver.findElement(By.linkText(elemento));
        }
        if (tipo.equals("xpath")) {
            elementoEncontrado = driver.findElement(By.xpath(elemento));
        }
        return elementoEncontrado;
    }

    public void digitarCampo(String tipo, String elemento, String digitar) {
        encontrarElemento(tipo, elemento).sendKeys(digitar);
    }

    public void clicar(String tipo, String elemento) {
        encontrarElemento(tipo, elemento).click();
    }

    public String pegarMensagem(String tipo, String elemento) {
        String mensagem = encontrarElemento(tipo, elemento).getText();
        return mensagem;
    }

//    public String pegarValue (String tipo, String elemento) {
//        String mensagem = encontrarElemento(tipo, elemento).get
//        return mensagem;
//    }

    public void esperarElementoId(String parId) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.id(parId)));
    }


    public void esperarElementoClass(String parClass) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.className(parClass))).click();
    }

    public void esperarElementoCssClicar(String parCss) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(parCss))).click();
    }

        public void esperarElementoCss(String parCss) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(parCss)));
    }

    public void esperarElementoXpathClicar(String parXpath) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parXpath))).click();
    }

    public void esperarElementolinkClicar(String parLink) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(parLink))).click();
    }

    public void selecionarOpcao(String elemento, String todos, String numero) {
        Select selecionar = new Select(driver.findElement(By.cssSelector(elemento)));
        selecionar.selectByVisibleText(todos);
        selecionar.selectByValue(numero);
    }

    public void selecionarOpcaoName(String elemento, int arg0) {
        Select selecionar = new Select(driver.findElement(By.name(elemento)));
        selecionar.selectByValue(String.valueOf(arg0));
    }

    public void esperarElementoIdClick(String parId) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.id(parId))).click();
    }

    public void fecharNavegador() {
        driver.quit();
    }


    public void screenshoot(Scenario scenario) throws InterruptedException {

        Thread.sleep(1000);
        byte[] screenshot = (((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        scenario.embed(screenshot, "image/png");
    }

    public void apagarMensagem(String tipo, String elemento) {
        encontrarElemento(tipo, elemento).clear();
    }

    public void esperarElementoXpath(String parXpath) {
        WebDriverWait aguardar = new WebDriverWait(driver, 10);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parXpath))).findElements(By.xpath("teste"));
    }

    public void tabelaReceberMensagem(String arg1, String elemento, String tipo) throws Throwable {
        String texto = encontrarElemento(tipo, elemento).getText();
        Assert.assertEquals(arg1, texto);
    }
    public void DownloadClicar (String downloadId){
        HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.defaul_content_setting.popups", 0);


        String downloadFilepath = System.getProperty("user.dir");
        chromePrefs.put("download.default_directory", downloadFilepath);

        driver.findElement(By.id(downloadId));

    }

}
