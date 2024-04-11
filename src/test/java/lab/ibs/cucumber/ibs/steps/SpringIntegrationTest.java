package lab.ibs.cucumber.ibs.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import lab.ibs.cucumber.ibs.IbsApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = IbsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringIntegrationTest {
}
