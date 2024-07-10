import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Code\\POMTesting\\src\\main\\java\\org\\example\\feature",
        glue = {"org.example"},
        tags = "@First"
)

public class TestRunner {

}
