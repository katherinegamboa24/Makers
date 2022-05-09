package com.bdd.web.steps;

import com.bdd.web.page.ContactoWebPage;
import cucumber.api.Scenario;
import org.json.JSONArray;

import static com.bdd.generico.webDriverDOM.getVariableOnSession;

public class ContactoWebSteps {

    ContactoWebPage contactoWebPage;


    public void cargo_la_pagina_principal_de_makers() {
        contactoWebPage.setDriver();

    }

    public void selecciono_la_opcion_CONTACTO() {
        contactoWebPage.opcionContacto();
    }


    public void obtengo_el_numero_de_servicio_al_cliente() {
        contactoWebPage.obtenerNumero();
    }


    public void ingreso_mi_nombre_apellido_correo_y_telefono(String nombre, String apellido, String email, String telefono) {
        contactoWebPage.ingresarDatos(nombre, apellido, email, telefono);
    }


    public void ingreso_el_mensaje_que_deseo_enviar(String mensaje) {
       /* Scenario scenario = getVariableOnSession("scenario");
        //JSONArray objeto = new JSONArray(getVariableOnSession("queryResult").toString());
        String print = "<b style='color:blue;'>QUERY:</b> "+ "<br></br><b style='color:red;'>RESPONSE:</b> ";
        scenario.embed(print.getBytes(), "text/html");*/
        contactoWebPage.ingresarMensaje(mensaje);
    }


    public void le_doy_click_al_boton_enviar_mensaje() {
        contactoWebPage.botonEnviar();
    }


    public void se_muestra_en_mensaje_de_envio_exitoso() {

    }
}
