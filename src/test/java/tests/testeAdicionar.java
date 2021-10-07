package tests;

/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/

import io.qameta.allure.Feature;
import org.jetbrains.annotations.Async;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.principal;
import suporte.AllureListener;
import suporte.BaseClass;

@Listeners({AllureListener.class})
public class testeAdicionar {
    private WebDriver navegador;

    @BeforeTest
    public void setup() {
        //navegador = Web.createNavegador();

        BaseClass bs = new BaseClass();
        navegador = bs.initialize_driver();
        navegador.get("https://automacaocombatista.herokuapp.com/treinamento/home");
    }

    @Test(description = "Navegar entre Paginas")
    @Feature("Feature: Navegação ")
    public void testaNavegarPaginas() {
        new principal(navegador)
                .SelecionarFormulario()
                .SelecionarBuscaElemento()
                .SelecionarMudancaFoco()
                .SelecionarWidget()
                .SelecionarIteracoes()
                .SelecionarOutros()
        ;
    }

    @Test(description = "Navegar entre Selecionar Formulario")
    @Feature("Feature: Navegação ")
    public void testSelecionarFormulario() {
        new principal(navegador)
                .SelecionarFormulario()
                .SelecionarCriarUsuario()
        ;
    }

    @Test(description = "Adicionar")
    @Feature("Feature: Adicionar Usuario ")
    public void AdicionarNovoUsuario() {
        new principal(navegador)
                .SelecionarFormulario()
                .FormularioCriarUsuarios()
                .AdicionarDados()
                .SelecionarBotaoCriar()
                .VerificarUsuarioInserido()
                .CLicarVoltarCadastro()
                .CLicarVoltarlista()
                ;
    }

    @Test(description = "Listar Usuarios")
    @Feature("Feature: Navegação ")
    public void testListaUsuarios() {
        new principal(navegador)
                .SelecionarFormulario()
                .FormularioListaUsuarios()
                .VerificarPaginaListaUsuarios()
                .ClicarBotaoVoltar()
        ;
    }

    //@Test
    public void ExcluirUsuario() {
        new principal(navegador)
                .SelecionarFormulario()
                .FormularioListaUsuarios()
                .IconeExcluirUsuarios()
        ;
    }

    @Test(description = "Buscar Elementos")
    @Feature("Feature: Navegação ")
    public void testSelecionarNovo() {
        new principal(navegador)
                .SelecionarBuscaElemento();

    }

    @Test(description = "Mudança de Foco")
    @Feature("Feature: Navegação ")
    public void testSelecionarMudancaFoco() {
        new principal(navegador)
                .SelecionarMudancaFoco()
                ;
    }

    @Test(description = "Selecionar Widget")
    @Feature("Feature: Navegação ")
    public void testSelecionarWidget() {
        new principal(navegador)
                .SelecionarWidget();
    }

    @Test(description = "Selecionar Iterações")
    @Feature("Feature: Navegação ")
    public void testSelecionarIteracoes() {
        new principal(navegador)
                .SelecionarIteracoes();
    }

    @Test(description = "Selecionar Outros")
    @Feature("Feature: Navegação ")
    public void testSelecionarOutros() {
        new principal(navegador)
                .SelecionarOutros();
    }

    @AfterTest
    public void tearDown() {
        //navegador.quit();
    }
}
