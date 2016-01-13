package de.dkutzer.tut.lombok.log;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@Log
// @Slf4j //works with slfj dependecies
@ToString
public class LogDemo {

    private final String name;
    private final Integer id;

    public static void main(String[] args) {
        LogDemo demo = new LogDemo("Ringo", 1);
        log.info(demo.toString());
    }
}
