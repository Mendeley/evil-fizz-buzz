package com.elsevier.fizzbuzz;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzConsoleImpl implements FizzBuzzConsole {

    @Override
    public void print(List<String> sequence, PrintStream outputStream) {
        String output = sequence.stream().collect(Collectors.joining(","));

        outputStream.println(output);
    }
}
