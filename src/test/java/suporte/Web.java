package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createNavegador(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Denisson\\Documents\\Programas\\Drivers\\geckodriver.exe");

        //WebDriver navegador = new ChromeDriver();
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Navegando ate a Pagina do Taskit
        navegador.get("https://automacaocombatista.herokuapp.com/treinamento/home");

        return navegador;

    }
}
