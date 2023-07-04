package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ResultsVuelosPage extends SeleniumWrapper {
    public ResultsVuelosPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By barraBusquedaLocator = By.name("q");
}
