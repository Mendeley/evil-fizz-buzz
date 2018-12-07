package com.elsevier.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Module15Tests {
    public Module15Tests() {
    }

    @Test
    public void givenANumberDividableBy15ReturnFizzBuzz() {
        int number = 15;

        Module15 module15 = new Module15();
        CompositeObject obj = new CompositeObject(number, ""+number);
        assertEquals("FizzBuzz", module15.process(obj).getValue());
    }

    @Test
    public void givenAnumberNotDividableBy15ReturnTheNumberItself() {
        int ten = 10;

        Module15 module15 = new Module15();
        CompositeObject obj = new CompositeObject(ten, ""+ten);
        assertEquals(obj, module15.process(obj));
    }
}
