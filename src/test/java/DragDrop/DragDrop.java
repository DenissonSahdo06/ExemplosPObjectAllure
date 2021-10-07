package DragDrop;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class DragDrop {
    //private WebDriver driver;

    public static void main(String[] args) throws Exception {

// Initiate browser
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Denisson\\Documents\\Programas\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

// maximize browser
        driver.manage().window().maximize();

// Open webpage

        //driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
        Thread.sleep(4000);

        // Verificar Página Lista de Funcionalidades - Xpath: /html/body/div[2]/div[1]/h4
        WebElement pagInicial = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h4"));
        String txtPagInicial = pagInicial.getText();
        assertEquals("Lista de Funcionalidades", txtPagInicial);
        System.out.println(txtPagInicial);

        // Verificar Opção Iterações - Xpath: /html/body/div[2]/div[1]/ul/li[5]/a
        WebElement OpIteracoes = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a"));
        String txtIteracoes = OpIteracoes.getText();
        assertEquals("Iterações", txtIteracoes);
        System.out.println(txtIteracoes);


        // Selecionar Interações /html/body/div[2]/div[1]/ul/li[5]/a
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a")).click();
        Thread.sleep(2000);

        // Selecionar Dragdrop - /html/body/div[2]/div[1]/ul/li[5]/div/ul/li[1]/a
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/div/ul/li[1]/a")).click();
        Thread.sleep(2000);

        //Lista de Funcionalidades
        String funcionalidades = driver.findElement(By.xpath(".//*[@class='bold']")).getText();
        assertEquals("Lista de Funcionalidades", funcionalidades);

        //Verificar se está na tela Drag and drop

        // Verificar Tela
        /*String telaDrag = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/h5")).getText();
        System.out.println("statusDrag");
        Assert.assertEquals(telaDrag,"Drag and Drop!!");*/
        //String statusDrag = driver.findElement(By.xpath("//*[@id=droppable]")).getText();
       // Assert.assertEquals(statusDrag,"Drop here");

// Add 5 seconds wait
        Thread.sleep(5000);

// Create object of actions class
        Actions act = new Actions(driver);

// find element which we need to drag
        WebElement drag = driver.findElement(By.xpath(".//*[@id='winston']"));


// find element which we need to drop
        WebElement drop = driver.findElement(By.xpath(".//*[@id='dropzone']"));


// this will drag element to destination
        act.dragAndDrop(drag, drop).build().perform();

        /*String statusDrop = driver.findElement(By.xpath("//*[@id=droppable]/p")).getText();
        Assert.assertEquals("Dropped!", statusDrop);*/

        driver.findElement(By.xpath(".//*[@class='btn red']")).click();




    }
}