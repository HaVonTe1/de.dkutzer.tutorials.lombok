package de.dkutzer.tut.lombok.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(exclude = "id")
public class ToStringPojo {

    private int id;
    private String prop;

    public static void main(String[] args) {
        ToStringPojo pojo = new ToStringPojo(1, "hallo");

        System.out.println(pojo);

    }
}
