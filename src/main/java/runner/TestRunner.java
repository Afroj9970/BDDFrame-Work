package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Afroz\\eclipse-workspace\\BDDFrameWork\\feature\\facebooklogin.feature",glue={"StepDefination"})
public class TestRunner {

}

