package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formularioPage extends BasePage {
    public formularioPage(WebDriver navegador) {

        super(navegador);
    }

    public CriarUsuario SelecionarCriarUsuario() {
        navegador.findElement(By.linkText("Criar Usuários")).click();
        return new CriarUsuario(navegador);
    }

    public CriarUsuario SelecionarUsuario() {
        navegador.findElement(By.linkText("Criar Usuários")).click();
        return new CriarUsuario(navegador);
    }


    public CriarUsuario EscolherCriarUsuario() {
        SelecionarCriarUsuario();
        SelecionarUsuario();
        return new CriarUsuario(navegador);
    }

}
