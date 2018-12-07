package com.elsevier.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzConsoleTest {

    @Test
    @Parameters({"Fizz,Buzz,FizzBuzz,3Fizz"})
    public void composesSequenceToCommaSeparatedString(String... sequence) {
        FizzBuzzConsole fizzBuzzConsole = new FizzBuzzConsoleImpl();

        List<String> sequenceList = Arrays.stream(sequence).collect(Collectors.toList());

        assertThat(fizzBuzzConsole.print(sequenceList), is("Fizz,Buzz,FizzBuzz,3Fizz"));
    }

    @Test
    public void outputsEmptyStringIfListIsEmpty() {
        FizzBuzzConsole fizzBuzzConsole = new FizzBuzzConsoleImpl();

        assertThat(fizzBuzzConsole.print(new ArrayList<>()), is(""));
    }
}
