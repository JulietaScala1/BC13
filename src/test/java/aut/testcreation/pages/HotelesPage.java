package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesPage extends SeleniumWrapper {
    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyATenerSuerteLocator = By.name("btnI");
}