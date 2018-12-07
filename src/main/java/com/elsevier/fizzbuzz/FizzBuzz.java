package com.elsevier.fizzbuzz;

public class FizzBuzz {
    private final SequenceGenerator sequenceGenerator;
    private final FizzBuzzConsole fizzBuzzConsole;

    public FizzBuzz(SequenceGenerator sequenceGenerator, FizzBuzzConsole fizzBuzzConsole) {
        this.sequenceGenerator = sequenceGenerator;
        this.fizzBuzzConsole = fizzBuzzConsole;
    }

    public void run(int start, int end) {
        fizzBuzzConsole.print(sequenceGenerator.generate(start, end), System.out);
    }
}
