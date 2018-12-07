package com.elsevier.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzConsoleImpl implements FizzBuzzConsole {

    @Override
    public String print(List<String> sequence) {
        return sequence.stream().collect(Collectors.joining(","));
    }
}
