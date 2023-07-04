package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class VuelosPage extends SeleniumWrapper {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By locatorTrenes = By.xpath("//a[.='Trenes']");
    By locatorHoteles = By.xpath("//a[.='Hoteles']");
    By locatorOrigen = By.xpath("//input[@placeholder='Ciudad o aeropuerto' and @aria-label='Origen']");
    //By locatorOrigenSelect = By.xpath("//input[@aria-activedescendant="option 0"]");
    By locatorDestino = By.xpath("//input[@placeholder='Ciudad o aeropuerto' and @aria-label='Destino']");
    By locatorCerrarCookies = By.xpath("//button[contains(text(),'Rechazar todo')]");
    By locatorPasajeros = By.xpath("");
    By locatorBtnBuscar = By.xpath("//button[.='Buscar']");
    By locatorCalendario = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorFechaIda = By.xpath("//button[.='10']");
    By locatorFechaVuelta = By.xpath("//button[.='19']");


    //métodos













































    public void cerrarCookies(){
        click(locatorCerrarCookies);
    }

    public void completarOrigen(String origen) throws InterruptedException {

        WebElement elementoCampoOrigen = driver.findElement(locatorOrigen);
        elementoCampoOrigen.clear();
        click(elementoCampoOrigen);
        write(origen,locatorOrigen);
        Thread.sleep(5000);
    }

    public void completarDestino (String destino) throws InterruptedException {
        WebElement elementoCampoDestino = driver.findElement(locatorDestino);
        elementoCampoDestino.clear();
        click(elementoCampoDestino);
        write(destino,locatorDestino);
        Thread.sleep(500);
    }

    public void ingresarFechas() {
        click(locatorCalendario);
        click(locatorFechaIda);
        click(locatorFechaVuelta);
    }

    public void clickearBtnBuscar(){
        click(locatorBtnBuscar);
    }

    public void irATrenes(){
        click(locatorTrenes);
    }

    public void irAHoteles(){
        click(locatorHoteles);
    }

}











