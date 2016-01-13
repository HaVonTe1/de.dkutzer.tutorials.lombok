package de.dkutzer.tut.lombok.sneakythrows;

import lombok.SneakyThrows;

public class SneakyThrowsDemo {

    @SneakyThrows
    public float div(int a, int b) {// look ma' no throws declaration...

        if (b == 0) {
            throw new IllegalAccessException("divisor cant be 0");
        }
        return a / b;
    }

    public static void main(String[] args) {

        SneakyThrowsDemo demo = new SneakyThrowsDemo();// and no try catch
        demo.div(5, 0);

    }
}
