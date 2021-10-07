package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import suporte.AllureListener;
import suporte.BaseClass;

import static org.junit.Assert.assertEquals;

@Listeners({AllureListener.class})
public class testePaginas extends BaseClass {

    public WebDriver navegador;

    @BeforeClass
    public void setUp() {
        BaseClass bs=new BaseClass();
        navegador = bs.initialize_driver();
        navegador.get("https://automacaocombatista.herokuapp.com/treinamento/home");
    }

    @Test
    public void testFormulario(){
        navegador.findElement(By.linkText("Formulário")).click();

        // Verificar Opção "Criar Usuários" - Xpath: /html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a
        WebElement OpFormulario = navegador.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
        String txtFormulario = OpFormulario.getText();
        assertEquals("Criar Usuários", txtFormulario);
        System.out.println(txtFormulario);

        // Verificar Opção "Lista de Usuários" - Xpath: /html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a
        WebElement OpListaUsuario = navegador.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"));
        String txtOpListaUsuario = OpListaUsuario.getText();
        assertEquals("Lista de Usuários", txtOpListaUsuario);
        System.out.println(txtOpListaUsuario);

        // Selecionar CriarUsuário
        navegador.findElement(By.linkText("Criar Usuários")).click();

        // Inserir dados para cadastro
        navegador.findElement(By.id("user_name")). sendKeys("Francisco");
        navegador.findElement(By.id("user_lastname")). sendKeys("Silva");
        navegador.findElement(By.id("user_email")). sendKeys("email@email.com");
        navegador.findElement(By.id("user_address")). sendKeys("Rua 6- Hileia 2");
        navegador.findElement(By.id("user_university")). sendKeys("Uninorte");
        navegador.findElement(By.id("user_profile")). sendKeys("Testador");
        navegador.findElement(By.id("user_gender")). sendKeys("Masculino");
        navegador.findElement(By.id("user_age")). sendKeys("30");

        // Selecionar Listar Usuário
        navegador.findElement(By.linkText("Lista de Usuários")).click();

        //Selecionar Botão Voltar "Voltar"
        //navegador.findElement(By.xpath("/html/body/div[2]/div[3]/div/a[2]")).click();
        navegador.findElement(By.xpath(".//*[@class='btn red']")).click();

    }
    @Test
    public void testBucaElementos(){
        navegador.findElement(By.linkText("Busca de elementos")).click();

    }
    @Test
    public void testMudancaFoco(){
        navegador.findElement(By.linkText("Mudança de foco")).click();

    }

    @Test
    public void testMudancaFoco2(){
        navegador.findElement(By.linkText("Mudança de foco")).click();
    }

    @Test
    public void testwidgets(){
        navegador.findElement(By.linkText("Widgets")).click();

    }

    @Test
    public void testIteracoes(){

       // Verificar Página Lista de Funcionalidades - Xpath: /html/body/div[2]/div[1]/h4
        WebElement pagInicial = navegador.findElement(By.xpath("/html/body/div[2]/div[1]/h4"));
        String txtPagInicial = pagInicial.getText();
        assertEquals("Lista de Funcionalidades", txtPagInicial);
        System.out.println(txtPagInicial);


        // Verificar Opção Iterações - Xpath: /html/body/div[2]/div[1]/ul/li[5]/a
        WebElement OpIteracoes = navegador.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a"));
        String txtIteracoes = OpIteracoes.getText();
        assertEquals("Iterações", txtIteracoes);
        System.out.println(txtIteracoes);


        // Selecionar Interações /html/body/div[2]/div[1]/ul/li[5]/a
        navegador.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a")).click();
        //Thread.sleep(2000);

        // Selecionar Dragdrop - /html/body/div[2]/div[1]/ul/li[5]/div/ul/li[1]/a
        navegador.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/div/ul/li[1]/a")).click();
        //Thread.sleep(2000);

        //Lista de Funcionalidades
        String funcionalidades = navegador.findElement(By.xpath(".//*[@class='bold']")).getText();
        assertEquals("Lista de Funcionalidades", funcionalidades);

        //Verificar se está na tela Drag and drop


        // Add 5 seconds wait
        //Thread.sleep(5000);

        // Create object of actions class
        Actions act = new Actions(navegador);

        // find element which we need to drag
        WebElement drag = navegador.findElement(By.xpath(".//*[@id='winston']"));

        // find element which we need to drop
        WebElement drop = navegador.findElement(By.xpath(".//*[@id='dropzone']"));

        // this will drag element to destination
        act.dragAndDrop(drag, drop).build().perform();

        /*String statusDrop = driver.findElement(By.xpath("//*[@id=droppable]/p")).getText();
        Assert.assertEquals("Dropped!", statusDrop);*/

        navegador.findElement(By.xpath(".//*[@class='btn red']")).click();


    }

    @Test
    public void testOutros(){
        navegador.findElement(By.linkText("Outros")).click();
    }

    @AfterClass
    public void tearDown(){
        navegador.quit();
    }

}
