package lab.ibs.cucumber.ibs.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lab.ibs.cucumber.ibs.dto.Element;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration
public class ElementsRemoveSteps extends SpringIntegrationTest {

    private Element[] elements;
    private final RestTemplate restTemplate = new RestTemplate();

    @Given("An elements wanted to be deleted")
    public void givenElement() {
        // thinks that bucket is not empty
    }

    @When("The element list are cleared")
    public void whenFruitIsAdded() {
        String deleteAllFruitsUrl = "http://localhost:8080/fruits/delete";
        elements = restTemplate.getForEntity(deleteAllFruitsUrl, Element[].class).getBody();
    }

    @Then("The empty list received")
    public void thenListFruitsShouldBeReturned() {
        assertEquals(0, Arrays.stream(elements).count());
    }
}
