package com.elsevier.fizzbuzz;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void substituteNumberThree() {
        DivisibleByThreeProcessor divisibleByThreeProcessor= new DivisibleByThreeProcessor();
        CompositeObject request = new CompositeObject(3, "");
        CompositeObject result = divisibleByThreeProcessor.process(request);

        assertEquals(result.getIndex(), 3);
        assertEquals(result.getValue(), "Fizz");
    }

    @Test
    public void doNotSubstituteNumberNotDivisibleByThree() {
        DivisibleByThreeProcessor divisibleByThreeProcessor= new DivisibleByThreeProcessor();
        CompositeObject request = new CompositeObject(2, "");
        CompositeObject result = divisibleByThreeProcessor.process(request);

        assertEquals(result.getIndex(), 2);
        assertEquals(result.getValue(), "");
    }
}
