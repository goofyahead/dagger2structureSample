package cof.gof.dagger2structure.models;

import lombok.Getter;

public class Pojo {
    @Getter
    private String name;

    public Pojo(String test) {
        this.name = test;
    }
}
