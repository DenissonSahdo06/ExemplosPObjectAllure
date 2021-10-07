package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ListaUsuarios extends BasePage {

    public ListaUsuarios(WebDriver navegador) {
        super(navegador);
    }

    //Selecionar Novo Usuario
    public CriarUsuario ClicarBotaoNovoUsuario(){
        navegador.findElement(By.xpath(".//*[@class='btn waves-light green']")).click();
        return new CriarUsuario(navegador);
    }

    //Selecionar Voltar
    public CriarUsuario ClicarBotaoVoltar(){
        navegador.findElement(By.xpath("//*[@class='btn red']")).click();
        return new CriarUsuario(navegador);
    }
    //Excluir Usuario
    public PopExcluir IconeExcluirUsuarios(){
        //navegador.findElement(By.xpath("//*[@data-method='delete']")).click();
        navegador.findElement(By.xpath("//*[@data-method='delete']")).click();
        return new PopExcluir(navegador);
    }
    //Verificar Lista de Usuarios
    public ListaUsuarios VerificarPaginaListaUsuarios(){
        WebElement msgLista = navegador.findElement(By.xpath("//h5[contains(text(),'Lista de Usuários')]"));
        String textoMsgLista = msgLista.getText();
        assertEquals("Lista de Usuários!!", textoMsgLista);
        return this;

    }

}
