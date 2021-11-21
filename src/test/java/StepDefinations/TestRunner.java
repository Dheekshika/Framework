package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/kirub/git/Framework/Framework/src/test/resources/feature",glue={"StepDefinations"})
public class TestRunner {

}
