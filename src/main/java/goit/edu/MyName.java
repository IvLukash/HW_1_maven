package goit.edu;

import lombok.Getter;

@Getter
public class MyName {
    private String name;
    private String lastName;

    public MyName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
