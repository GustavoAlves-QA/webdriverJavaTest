import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.FileSystemNotFoundException;
import java.sql.Driver;

public class Vereficacao {

    @Test
    public void testAdicionar() {

        System.setProperty("webdriver.chrome.driver","C:\\Intellij\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://juliodelima.com.br/taskit");


    }

    }

