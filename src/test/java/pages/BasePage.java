package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador) {

        this.navegador = navegador;
    }

    public CriarUsuario SelecionarCriarUsuario() {
        navegador.findElement(By.linkText("Criar Usuários")).click();
        return new CriarUsuario(navegador);

    }
}
