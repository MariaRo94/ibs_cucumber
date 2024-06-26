package lab.ibs.cucumber.ibs.coontroller;

import lab.ibs.cucumber.ibs.dto.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class ElementsController {
    HashMap<String, Element> bucket = new HashMap<>();

    @PostMapping("/fruits/add")
    public List<Element> putFruitToBucket(@RequestBody Element fruit) {
        bucket.put(fruit.getName(), fruit);
        return new ArrayList<>(bucket.values());
    }

    @GetMapping("/fruits/delete")
    public List<Element>  clearAll() {
        bucket.clear();
        return new ArrayList<>(bucket.values());
    }

    @GetMapping("/fruits/get/{fruit}")
    public Element getFruit(@PathVariable String fruit) {
        return bucket.get(fruit);
    }
}
