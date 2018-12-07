package com.elsevier.fizzbuzz;

public class DivisibleByThreeProcessor implements NumberFilter {
    public CompositeObject process(CompositeObject request) {
        if ((request.getIndex() % 3) == 0) {
            return new CompositeObject(request.getIndex(), "Fizz");
        }

        return request;
    }
}
