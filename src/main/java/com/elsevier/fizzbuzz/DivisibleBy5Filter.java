package com.elsevier.fizzbuzz;

public class DivisibleBy5Filter implements NumberFilter {
    public CompositeObject process(CompositeObject number) {
        String value = "";

        if (number.getIndex() % 5 == 0) {
            value = "Buzz";
        } else {
            value = String.valueOf(number.getIndex());
        }

        return new CompositeObject(number.getIndex(), value);
    }
}
