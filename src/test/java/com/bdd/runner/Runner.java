package com.bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.bdd.web.stepDefinition"},
        tags = {"@Registro_Consulta"}
)
public class Runner {


}
