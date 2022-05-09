package com.bdd.web.page;

import com.bdd.generico.webDriverDOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBDPage extends webDriverDOM {


    public ConexionBDPage(WebDriver Driver) {
        super(Driver);
    }


    private final String db="buulm8txegwfephqdftv";
    private final String url="jdbc:mysql://un634ij7o90bzzjo:4T4o9KfrlAVzGCeU93Iw@buulm8txegwfephqdftv-mysql.services.clever-cloud.com:3306/"+db+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String user="un634ij7o90bzzjo";
    private final String pass="4T4o9KfrlAVzGCeU93Iw";

    public void openConnection(){
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect= DriverManager.getConnection(url, user, pass);

            if (connect!=null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Conexión fallida");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }


    public void closeConnection(Connection connect){
        try {
            connect.close();
            System.out.println("Conexión Cerrada Exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
