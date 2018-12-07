package com.elsevier.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DivisibleBy15ProcessorTest {

    @Test
    @Parameters({"15","30","45","60"})
    public void givenANumberDivisibleBy15ReturnFizzBuzz(int number) {

        DivisibleBy15Processor divisibleBy15Processor = new DivisibleBy15Processor();
        CompositeObject obj = new CompositeObject(number, ""+number);
        assertEquals("FizzBuzz", divisibleBy15Processor.process(obj).getValue());
    }

    @Test
    @Parameters({"14","29","44","59"})
    public void givenANumberNotDivisibleBy15ReturnTheNumberItself(int number) {

        DivisibleBy15Processor divisibleBy15Processor = new DivisibleBy15Processor();
        CompositeObject obj = new CompositeObject(number, ""+number);
        assertEquals(obj, divisibleBy15Processor.process(obj));
    }
}
