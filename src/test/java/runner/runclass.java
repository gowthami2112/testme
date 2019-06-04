package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumbercase1.case1;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/example25.feature",glue="cucumbercase1",
plugin="html:c:\\cucumber-html-report")
public class runclass {

}
