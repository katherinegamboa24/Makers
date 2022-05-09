package com.bdd.web.stepDefinition;

import com.bdd.web.steps.ConexionBDSteps;
import cucumber.api.DataTable;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Dados;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ConexionBDStepDefinition extends ScenarioSteps {

    @Steps
    ConexionBDSteps conexionBDSteps;

    @Dado("^los siguientes parametros de entrada$")
    public void los_siguientes_parametros_de_entrada(DataTable data) {
        conexionBDSteps.los_siguientes_parametros_de_entrada(data);
    }

   /* @Entonces("^debo insertar los registros en la base de datos$")
    public void debo_insertar_los_registros_en_la_base_de_datos() {
        conexionBDSteps.debo_insertar_los_registros_en_la_base_de_datos();
    }

    @Dados("^los parametros de entrada previo$")
    public void los_parametros_de_entrada_previo() {
        conexionBDSteps.los_parametros_de_entrada_previo();
    }

    @Entonces("^calcular el valor total$")
    public void calcular_el_valor_total() {
        conexionBDSteps.calcular_el_valor_total();
    }

    @Entonces("^validar el valor total sea igual a la base de datos$")
    public void validar_el_valor_total_sea_igual_a_la_base_de_datos() {
        conexionBDSteps.validar_el_valor_total_sea_igual_a_la_base_de_datos();
    }*/

}
