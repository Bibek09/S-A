package com.prepare.sense.act;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin={}, glue="", features="src/test/resources", tags={"@smoketest2"})
public class AcceptanceTestSuite {

}
