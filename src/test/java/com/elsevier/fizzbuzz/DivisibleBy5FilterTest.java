package com.elsevier.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleBy5FilterTest {
    @Test
    public void fiveShouldReturnBuzz() {
        DivisibleBy5Filter divisibleBy5Filter = new DivisibleBy5Filter();

        String processedString = divisibleBy5Filter.process(new CompositeObject(5, "")).getValue();

        assertEquals("Buzz", processedString);
    }

    @Test
    public void threeShouldReturnThree() {
        DivisibleBy5Filter divisibleBy5Filter = new DivisibleBy5Filter();

        String processedString = divisibleBy5Filter.process(new CompositeObject(3, "")).getValue();

        assertEquals("3", processedString);
    }
}
