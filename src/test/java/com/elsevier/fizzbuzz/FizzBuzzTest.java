package com.elsevier.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void run() {
        FizzBuzzConsole output = mock(FizzBuzzConsole.class);
        //noinspection unchecked
        List<String> sequence = mock(List.class);
        SequenceGenerator sequenceGenerator = mock(SequenceGenerator.class);
        when(sequenceGenerator.generate(1, 10)).thenReturn(sequence);
        new FizzBuzz(sequenceGenerator, output).run(1, 10);
        verify(output).print(sequence);
    }

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
