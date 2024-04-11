package lab.ibs.cucumber.ibs.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lab.ibs.cucumber.ibs.dto.Element;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration
public class ElementAddSteps extends SpringIntegrationTest {
    private String addFruitUrl = "http://localhost:8080/fruits/add";
    private Element[] elements;
    private final RestTemplate restTemplate = new RestTemplate();
    private Element element;

    @Given("An element with type {string} and name {string} and id {string} and exotic {string}")
    public void givenElement(String name, String type, String id, String exotic) {
        element = new Element();
        element.setId(Integer.parseInt(id));
        element.setName(name);
        element.setExotic(Boolean.parseBoolean(exotic));
        element.setType(type);
    }

    @When("The element are added")
    public void whenFruitIsAdded() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Element> requestEntity = new HttpEntity<>(element, headers);
        elements = restTemplate.postForEntity(addFruitUrl, requestEntity, Element[].class).getBody();
    }

    @Then("The element list should be returned")
    public void thenListFruitsShouldBeReturned() {
        assertNotNull(elements);
    }
}
