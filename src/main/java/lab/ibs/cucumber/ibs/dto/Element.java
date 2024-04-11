package lab.ibs.cucumber.ibs.dto;

import lombok.Data;

@Data
public class Element {
    private int id;
    private String name;
    private boolean isExotic;
    private String type;
}
