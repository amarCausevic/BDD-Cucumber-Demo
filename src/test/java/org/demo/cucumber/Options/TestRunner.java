package org.demo.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/demo/features",
        glue = "org/demo/stepDefinations"
)
public class TestRunner {
}
