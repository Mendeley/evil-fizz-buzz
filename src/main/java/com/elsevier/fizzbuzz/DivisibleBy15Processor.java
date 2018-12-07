package com.elsevier.fizzbuzz;

public class DivisibleBy15Processor implements NumberFilter {


    public static final String FIZZ_BUZZ = "FizzBuzz";

    public CompositeObject process(CompositeObject compositeObject) {
        if (compositeObject.getIndex() % 15 == 0)
            return new CompositeObject(compositeObject.getIndex(), FIZZ_BUZZ);
        return compositeObject;
    }

}
