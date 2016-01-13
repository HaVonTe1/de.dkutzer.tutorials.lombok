package de.dkutzer.tut.lombok.data;

import java.util.List;

import lombok.Data;

@Data(staticConstructor = "of")
public class DataDemo {
    private final String founder;
    private String name;
    private List<String> employees;

    public static void main(String[] args) {

        DataDemo c1 = DataDemo.of("Bill Gates");
        c1.setName("Microsoft"); // generated setter
        System.out.println(c1);// calls generated toString
        System.out.println(c1.getFounder());// calls generated getter

        DataDemo c2 = DataDemo.of("Steve Jobs");

        System.out.println(c1.equals(c2));// calls generated equals

    }
}