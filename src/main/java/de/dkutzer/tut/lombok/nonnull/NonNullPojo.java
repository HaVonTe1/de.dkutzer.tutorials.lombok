package de.dkutzer.tut.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class NonNullPojo {

    @NonNull
    private Integer id;

    private String name;

    public static void main(String[] args) {

        NonNullPojo pojo = new NonNullPojo();

        pojo.setName(null); // fine
        pojo.setId(null);// throws NPE
    }
}
