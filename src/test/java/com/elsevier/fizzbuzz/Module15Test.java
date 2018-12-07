package com.elsevier.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Module15Test {

    @Test
    @Parameters({"15","30","45","60"})
    public void givenANumberDividableBy15ReturnFizzBuzz(int number) {

        Module15 module15 = new Module15();
        CompositeObject obj = new CompositeObject(number, ""+number);
        assertEquals("FizzBuzz", module15.process(obj).getValue());
    }

    @Test
    @Parameters({"14","29","44","59"})
    public void givenAnumberNotDividableBy15ReturnTheNumberItself(int number) {

        Module15 module15 = new Module15();
        CompositeObject obj = new CompositeObject(number, ""+number);
        assertEquals(obj, module15.process(obj));
    }
}
