package com.elsevier.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzConsoleTest {

    @Test
    @Parameters({"Fizz,Buzz,FizzBuzz,3Fizz"})
    public void composesSequenceToCommaSeparatedString(String... sequence) {
        FizzBuzzConsole fizzBuzzConsole = new FizzBuzzConsoleImpl();

        List<String> sequenceList = Arrays.stream(sequence).collect(Collectors.toList());

        PrintStream outputStream = mock(PrintStream.class);

        String expectedOutput = "Fizz,Buzz,FizzBuzz,3Fizz";
        fizzBuzzConsole.print(sequenceList, outputStream);

        verify(outputStream).println(expectedOutput);
    }

    @Test
    public void outputsEmptyStringIfListIsEmpty() {
        FizzBuzzConsole fizzBuzzConsole = new FizzBuzzConsoleImpl();

        PrintStream outputStream = mock(PrintStream.class);

        fizzBuzzConsole.print(new ArrayList<>(), outputStream);

        verify(outputStream).println("");
    }
}
