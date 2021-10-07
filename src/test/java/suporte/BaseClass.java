package suporte;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver navegador;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public WebDriver initialize_driver() {

        WebDriverManager.firefoxdriver ().setup();
        navegador = new FirefoxDriver();
        navegador.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        tdriver.set(navegador);
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {

        return tdriver.get();
    }
}
