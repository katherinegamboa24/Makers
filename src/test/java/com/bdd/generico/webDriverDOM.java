package com.bdd.generico;

import cucumber.api.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class webDriverDOM extends PageObject {

    public WebDriver driver;

    public webDriverDOM(WebDriver driver) {
        this.driver = driver;
    }

    public void generarEvidencia(Scenario scenario) {
        scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
       // byte[] screenshot = (byte[])((TakesScreenshot)this.getDriver()).getScreenshotAs(OutputType.BYTES);
      //  scenario.embed(screenshot, "image/png");
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKeys(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public List<WebElement> findElements(By locator, String selectText) {
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement el : elements) {
            if (selectText.equals(el.getText())) {
                el.click();
            }
        }
        return elements;
    }

    public static void saveVariableOnSession(String key, Object value) {
        Serenity.setSessionVariable(key).to(value);
    }

    public static <T> T getVariableOnSession(String key) {
        return Serenity.sessionVariableCalled(key);
    }

    public Select findElements1(By locator, String selectText) {
        Select elements = new Select(driver.findElement(locator));
        elements.selectByVisibleText(selectText);
        return elements;
    }

    public boolean isVisibleElement(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        bordear_elemento(element);
        return element.getText();
    }

    public void elementWait(int timeout) throws ElementNotVisibleException {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public void sleep(int segundos) {
        try {
            Thread.sleep(segundos);
        } catch (InterruptedException ie) {
        }
    }

    public void bordear_elemento(WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", locator);
        waitFor(1).seconds();
    }

    public void PopUpWindow() {
      /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         new WebDriverWait(driver, 5).until(ExpectedConditions.alertIsPresent());
         driver.switchTo().alert().accept();
         //Alert alert = driver.switchTo().alert();
         //alert.accept();*/
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            Thread.sleep(1000);
            wait.until(ExpectedConditions.alertIsPresent());
            Thread.sleep(1000);
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            Thread.sleep(1000);
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Thanks."));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public void Close() {
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.close();
        driver.switchTo().window(handlesList.get(0));
    }

    public void AlertWindows() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }


    public void Back() {
        driver.switchTo().defaultContent();
    }


    public void cambiarFrame(int codigoFrame) {
        driver.switchTo().frame(codigoFrame);
    }

}
