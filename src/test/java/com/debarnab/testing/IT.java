package com.debarnab.testing;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources"
       // , glue = {"com.debarnab.cucumber.testSteps"}
       // , format = {"pretty", "html:target/site/billing/cucumber-pretty-billing.html", "json:target/cucumber-billing.json"}
        //, tags = {"@billing"}
)
public class IT {
}
