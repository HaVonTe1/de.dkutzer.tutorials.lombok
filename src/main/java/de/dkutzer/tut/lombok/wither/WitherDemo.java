package de.dkutzer.tut.lombok.wither;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Wither;

@Data
@AllArgsConstructor
public class WitherDemo {

    private String prop;

    @Wither
    private String extra;

    public static void main(String[] args) {

        WitherDemo obj1 = new WitherDemo("Hallo", "Welt");

        final WitherDemo obj2 = obj1.withExtra("42");
        obj1.setProp("6*9");
        System.out.println(obj1);
        System.out.println(obj2);

        // WitherDemo(prop=6*9, extra=Welt)
        // WitherDemo(prop=Hallo, extra=42)
    }

}
