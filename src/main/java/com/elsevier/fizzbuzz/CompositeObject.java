package com.elsevier.fizzbuzz;

public class CompositeObject {
    private final int index;
    private final String value;

    public CompositeObject(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }
}

