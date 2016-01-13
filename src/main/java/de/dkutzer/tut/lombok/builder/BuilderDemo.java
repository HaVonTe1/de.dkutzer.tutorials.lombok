package de.dkutzer.tut.lombok.builder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class BuilderDemo {

    @NonNull
    private Integer id;
    private String firstName;
    private String lastName;

    public static void main(String[] args) {
        BuilderDemo demo = BuilderDemo.builder().firstName("Ringo").lastName("Starr").build();

        System.out.println(demo);
    }
}
