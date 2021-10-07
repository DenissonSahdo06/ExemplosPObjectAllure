package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarUsuario extends BasePage {

    public CriarUsuario(WebDriver navegador) {

        super(navegador);
    }

    public CriarUsuario AdicionarDados() {
        navegador.findElement(By.id("user_name")). sendKeys("Francisco");
        navegador.findElement(By.id("user_lastname")). sendKeys("Silva");
        navegador.findElement(By.id("user_email")). sendKeys("email@email.com");
        navegador.findElement(By.id("user_address")). sendKeys("Rua 300- Hi2");
        navegador.findElement(By.id("user_university")). sendKeys("Uninove");
        navegador.findElement(By.id("user_profile")). sendKeys("Testador");
        navegador.findElement(By.id("user_gender")). sendKeys("Masculino");
        navegador.findElement(By.id("user_age")). sendKeys("30");

        return this;
    }

    public UsuarioCriado SelecionarBotaoCriar() {
        navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/form/div[5]/div/div/input")).click();
        return new UsuarioCriado(navegador);
    }

    public principal SelecionarBotaoVoltar() {
        navegador.findElement(By.xpath(".//*[@class='btn red']")).click();
        return new principal(navegador);
    }
}
