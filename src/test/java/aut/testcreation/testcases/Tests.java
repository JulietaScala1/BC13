package aut.testcreation.testcases;

import aut.testcreation.pages.HotelesPage;
import aut.testcreation.pages.TrenesPage;
import aut.testcreation.pages.VuelosPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Tests {

    //esta clase tiene que llamar a las Pages
    private VuelosPage vuelosPage;
    private TrenesPage trenesPage;
    private HotelesPage hotelesPage;

    //instanciar el driver
    private WebDriver driver;

    @BeforeEach
    public void preTests() {
        WebDriverManager.chromedriver().setup(); //setear el driver
        driver = new ChromeDriver();
        vuelosPage = new VuelosPage(driver);
        trenesPage = new TrenesPage(vuelosPage.getDriver());
        hotelesPage = new HotelesPage(vuelosPage.getDriver());
        vuelosPage.navigateTo("https://www.rumbo.es/");
    }

    @AfterEach
    public void postTests() {

    }

    @Test
    /*public void CP001_formulario_incorrecto_mail_vacio(){
        //ejemplo de test
        Assertions.assertEquals("...", ...);
    }*/




































    public void CP001_busqueda_vuelos_valida() throws InterruptedException {
        vuelosPage.cerrarCookies();
        vuelosPage.completarOrigen("Sao Paulo");
        vuelosPage.completarDestino("Barcelona (BCN) - El Prat, España");
        vuelosPage.ingresarFechas();
        vuelosPage.clickearBtnBuscar();
        Assertions.assertEquals();
    }

    public void CP002_busqueda_vuelos_invalida_destino_incompleto() throws InterruptedException {
        vuelosPage.cerrarCookies();
        vuelosPage.completarOrigen("Sao Paulo");
        vuelosPage.completarDestino("");
        vuelosPage.ingresarFechas();
        vuelosPage.clickearBtnBuscar();
        Assertions.assertEquals("...", ...);
    }

    @Test
    public void CP002_trenes() {
        vuelosPage.cerrarCookies();
        vuelosPage.irATrenes();
    }

    @Test
    public void CP003_hoteles(){
        vuelosPage.cerrarCookies();
        vuelosPage.irAHoteles();
    }
}

