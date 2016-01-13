package de.dkutzer.tut.lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.val;

public class ValDemo {

    public static void main(String[] args) {

        val value = new String("Hallo Welt");
        System.out.println(value);

        val v2 = new HashMap<Integer, List<String>>();
        v2.put(1, new ArrayList<>());

        System.out.println(v2);
    }
}
