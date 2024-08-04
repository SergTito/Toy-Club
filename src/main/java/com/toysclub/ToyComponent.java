package com.toysclub;

import lombok.Data;

@Data //getter/setter/toString/hashcode/equals
public class ToyComponent {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        CONSTRUCTION_SET, SOFT, PLAY, ELECTRONIC, SPORTS
    }
}
