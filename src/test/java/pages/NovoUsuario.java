package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NovoUsuario extends BasePage{

    public NovoUsuario (WebDriver navegador) {
        super(navegador);
    }

    public NovoUsuario SelecionarSalvarNovo () {
        navegador.findElement(By.xpath(" /html/body/div[2]/div[2]/div[3]/div[2]/form/div[6]/div/div/input")).click();
        return this;
    }
    // /html/body/div[2]/div[2]/div[3]/div[2]/form/div[5]/div/div/input
    public UsuarioCriado NovoUsuario() {
        navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/form/div[5]/div/div/input")).click();
        return new UsuarioCriado(navegador);
    }

    public NovoUsuario CLicarVoltarlista() {
        navegador.findElement(By.xpath("//*[@class='btn red']")).click();
        return new NovoUsuario(navegador);
    }
}
