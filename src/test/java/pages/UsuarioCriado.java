package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Principal;

import static org.junit.Assert.assertEquals;

public class UsuarioCriado extends BasePage {

    public UsuarioCriado(WebDriver navegador) {
        super(navegador);
    }

    public UsuarioCriado VerificarUsuarioInserido() {
        WebElement msgInserir = navegador.findElement(By.id("notice"));
        String textoMsgInserir = msgInserir.getText();
        assertEquals("Usuário Criado com sucesso", textoMsgInserir);
        return this;
    }

    public NovoUsuario CLicarVoltarCadastro() {
        //navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[2]")).click();
        navegador.findElement(By.xpath("//*[@class='btn waves-light red']")).click();
        return new NovoUsuario (navegador);
    }

    public principal CLicarBoatEditar() {
        navegador.findElement(By.xpath(".//*[@class='btn waves-light blue']")).click();
        return new principal(navegador);
    }


}
