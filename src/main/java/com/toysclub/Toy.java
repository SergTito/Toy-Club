package com.toysclub;

import lombok.Data;

import java.util.List;

@Data
class Toy {
    private String name;
    private List<ToyComponent> components;
}
