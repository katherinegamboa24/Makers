package com.bdd.web.steps;

import com.bdd.web.page.ConexionBDPage;
import cucumber.api.DataTable;
import cucumber.api.java.es.Dados;
import cucumber.api.java.es.Entonces;

public class ConexionBDSteps {

    ConexionBDPage conexionBDPage;

    public void los_siguientes_parametros_de_entrada(DataTable data) {
        conexionBDPage.openConnection();
       // conexionBDPage.closeConnection(data);
    }


    /*public void debo_insertar_los_registros_en_la_base_de_datos() {

    }


    public void los_parametros_de_entrada_previo() {

    }


    public void calcular_el_valor_total() {

    }


    public void validar_el_valor_total_sea_igual_a_la_base_de_datos() {

    }*/
}
