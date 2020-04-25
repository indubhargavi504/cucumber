package skeleton;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/feature6.feature",
                glue="stepdefination",
                //tags= {"~@search"},
                plugin={"html:target/htmlreport",
                        "json:target/jsonreport.json",
                        "junit:target/xmlreport.xml"
                })
public class runner extends AbstractTestNGCucumberTests {

 

}
 