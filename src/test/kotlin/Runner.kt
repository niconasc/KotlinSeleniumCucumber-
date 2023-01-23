import core.SeleniumDSL
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.AfterClass
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    plugin = [
        "pretty",
        "html:src/main/report",
        "json:src/main/report/cucumber.json"
    ],
    features = [
        "src/main/resources/features"
    ],
    glue = [
        "stepDefinition"
    ],
    tags = [
        "@all"
    ]
)
class Runner {
}