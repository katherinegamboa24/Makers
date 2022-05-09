package com.bdd.web.page;

import com.bdd.generico.webDriverDOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ContactoWebPage extends webDriverDOM {


    public ContactoWebPage(WebDriver Driver) {
        super(Driver);
    }

    public void setDriver() {
       System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://somosmakers.co/");

    }

    public void opcionContacto(){
       click(By.xpath("/html/body/div/div/header/div/div/div/div[2]/div/div/div/div[1]/nav/ul/li[5]/a"));
    }

    public String obtenerNumero(){
        List<WebElement> elem_orden = driver.findElements(By.xpath("//*[@href='tel:+57(034)4310348']"));
        waitFor(3).second();
        bordear_elemento(elem_orden.get(0));
        saveVariableOnSession("telefono",elem_orden);
        System.out.println("telefono ggfg:"+ elem_orden);
        return elem_orden.get(0).getText();

    }

    public void ingresarDatos(String nombre, String apellido, String email, String telefono ){
        click(By.id("et_pb_contact_first_0"));
        sendKeys(nombre,By.id("et_pb_contact_first_0"));
        waitFor(2).second();
        click(By.id("et_pb_contact_last_0"));
        sendKeys(apellido,By.id("et_pb_contact_last_0"));
        waitFor(2).second();
        click(By.id("et_pb_contact_email_0"));
        sendKeys(email,By.id("et_pb_contact_email_0"));
        waitFor(2).second();
        click(By.id("et_pb_contact_phone_0"));
        sendKeys(telefono,By.id("et_pb_contact_phone_0"));
        waitFor(2).second();

    }

    public void ingresarMensaje(String mensaje){
        click(By.id("et_pb_contact_message_0"));
        waitFor(2).second();
        sendKeys(mensaje,By.id("et_pb_contact_message_0"));
       // getVariableOnSession("telefono");
        waitFor(10).second();
        //generarEvidencia(getVariableOnSession("scenario"));
    }



    public void botonEnviar(){
        waitFor(3).second();
        click(By.xpath("//*[contains(text(),'Enviar Mensaje')]"));
    }

}
