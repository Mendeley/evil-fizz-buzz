package com.elsevier.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {

    @Test
    public void run() {
        FizzBuzzConsole output = mock(FizzBuzzConsole.class);
        //noinspection unchecked
        List<String> sequence = mock(List.class);
        SequenceGenerator sequenceGenerator = mock(SequenceGenerator.class);
        when(sequenceGenerator.generate(1, 10)).thenReturn(sequence);
        new FizzBuzz(sequenceGenerator, output).run(1, 10);

        verify(output).print(sequence, System.out);
    }
}
