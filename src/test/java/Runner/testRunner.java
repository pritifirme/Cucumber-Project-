package Runner;

import Arise.Base.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features ="src/test/java/Feature",
        glue="Arise/StepDefination",
        monochrome = true,
        tags = "@Login"
)


public class testRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void preCondition(){
        System.out.println("pre-condition");
        BaseTest.launchBrowser();
    }
    @AfterClass
    public void postCondition(){
        System.out.println("post-condition");
       BaseTest.driver.quit();
    }
}
