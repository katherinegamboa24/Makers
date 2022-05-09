package com.bdd.web.stepDefinition;

import com.bdd.web.steps.ContactoWebSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactoWebStepDefinition extends ScenarioSteps {

    @Steps
    ContactoWebSteps contactoWebSteps;

    @Dado("^cargo la pagina principal de makers$")
    public void cargo_la_pagina_principal_de_makers() {
        contactoWebSteps.cargo_la_pagina_principal_de_makers();
    }


    @Dado("^que selecciono la opcion CONTACTO$")
    public void selecciono_la_opcion_CONTACTO() {
        contactoWebSteps.selecciono_la_opcion_CONTACTO();
    }

    @Cuando("^obtengo el numero de servicio al cliente$")
    public void obtengo_el_numero_de_servicio_al_cliente() {
        contactoWebSteps.obtengo_el_numero_de_servicio_al_cliente();
    }

    @Cuando("^ingreso mi nombre (.*) apellido (.*) correo (.*) y telefono (.*)$")
    public void ingreso_mi_nombre_apellido_correo_y_telefono(String nombre, String apellido, String email, String telefono) {
        contactoWebSteps.ingreso_mi_nombre_apellido_correo_y_telefono(nombre, apellido, email, telefono);
    }

    @Cuando("^ingreso el mensaje que deseo enviar (.*)$")
    public void ingreso_el_mensaje_que_deseo_enviar(String mensaje) {
        contactoWebSteps.ingreso_el_mensaje_que_deseo_enviar(mensaje);
    }

    @Cuando("^le doy click al boton enviar mensaje$")
    public void le_doy_click_al_boton_enviar_mensaje() {
        contactoWebSteps.le_doy_click_al_boton_enviar_mensaje();
    }

    @Entonces("^se muestra en mensaje de envio exitoso$")
    public void se_muestra_en_mensaje_de_envio_exitoso() {
        contactoWebSteps.se_muestra_en_mensaje_de_envio_exitoso();
    }
}
