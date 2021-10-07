package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class principal extends BasePage {

    public principal(WebDriver navegador) {
        super(navegador);
    }

    public principal SelecionarFormulario() {
        navegador.findElement(By.linkText("Formulário")).click();
        return this;
    }
    public CriarUsuario FormularioCriarUsuarios() {
        navegador.findElement(By.linkText("Criar Usuários")).click();
        return new CriarUsuario(navegador);
    }
    public ListaUsuarios FormularioListaUsuarios() {
        navegador.findElement(By.linkText("Lista de Usuários")).click();
        return new ListaUsuarios(navegador);
    }

    public principal SelecionarBuscaElemento () {
        navegador.findElement(By.linkText("Busca de elementos")).click();
        return this;
    }
    public principal BuscaElementoLinks() {
        navegador.findElement(By.linkText("Links")).click();
        return this;
    }
    public principal BuscaElementoInputs() {
        navegador.findElement(By.linkText("Inputs e TextField")).click();
        return this;
    }
    public principal BuscaElementoBotoes() {
        navegador.findElement(By.linkText("Botões")).click();
        return this;
    }
    public principal BuscaElementoRadio() {
        navegador.findElement(By.linkText("Radio e Checkbox")).click();
        return this;
    }
    public principal BuscaElementoDrop() {
        navegador.findElement(By.linkText("Dropdown e Select")).click();
        return this;
    }
    public principal BuscaElementoTextos() {
        navegador.findElement(By.linkText("Textos")).click();
        return this;
    }
    public principal BuscaElementoTabela() {
        navegador.findElement(By.linkText("Tabela")).click();
        return this;
    }

    public principal SelecionarMudancaFoco() {
        navegador.findElement(By.linkText("Mudança de foco")).click();
        return this;
    }
    public principal SelecionarMudancaFocoAlert() {
        navegador.findElement(By.linkText("Alert")).click();
        return this;
    }
    public principal SelecionarMudancaFocoIframe() {
        navegador.findElement(By.linkText("Iframe")).click();
        return this;
    }
    public principal SelecionarMudancaFocoJanela() {
        navegador.findElement(By.linkText("Janela")).click();
        return this;
    }
    public principal SelecionarMudancaFocoModal() {
        navegador.findElement(By.linkText("Modal")).click();
        return this;
    }

    public principal SelecionarWidget(){
        navegador.findElement(By.linkText("Widgets")).click();
        return this;
    }
    public principal SelecionarWidgetAccordion() {
        navegador.findElement(By.linkText("Accordion")).click();
        return this;
    }
    public principal SelecionarWidgetAuto() {
        navegador.findElement(By.linkText("Autocomplete")).click();
        return this;
    }
    public principal SelecionarWidgetDatapicker() {
        navegador.findElement(By.linkText("Datapicker")).click();
        return this;
    }

    public principal SelecionarIteracoes() {
        navegador.findElement(By.linkText("Iterações")).click();
        return this;
    }
    public principal SelecionarIteracoesDrag() {
        navegador.findElement(By.linkText("Drag And Drop")).click();
        return this;
    }
    public principal SelecionarIteracoesMouse() {
        navegador.findElement(By.linkText("Mousehover")).click();
        return this;
    }

    public principal SelecionarOutros() {
        navegador.findElement(By.linkText("Outros")).click();
        return this;
    }
    public principal SelecionarOutrosUpload() {
        navegador.findElement(By.linkText("Upload de Arquivo")).click();
        return this;
    }
    public principal SelecionarOutrosScroll() {
        navegador.findElement(By.linkText("Scroll")).click();
        return this;
    }
    // inserir comentario alteração feita em desenvolvimento
    public principal SelecionarOutrosUp() {
        navegador.findElement(By.linkText("Outros")).click();
        navegador.findElement(By.linkText("Upload de Arquivo")).click();
        return this;
    }

}
