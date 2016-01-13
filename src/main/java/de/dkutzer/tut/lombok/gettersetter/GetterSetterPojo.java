package de.dkutzer.tut.lombok.gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
// @Setter //geht nicht wegen final
@RequiredArgsConstructor
public class GetterSetterPojo {

    private final int id;
    private final String propStr;
    @Setter(AccessLevel.PRIVATE)

    private boolean status;

    // #####################################################
    public static void main(String[] args) {
        GetterSetterPojo pojo = new GetterSetterPojo(1, "hallo");
        pojo.setStatus(true);// funktioniert nur, weil "main" Teil der Klasse
                             // ist
    }
}
