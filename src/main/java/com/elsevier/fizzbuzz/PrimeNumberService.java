package com.elsevier.fizzbuzz;

import java.util.stream.IntStream;

public class PrimeNumberService {

    public boolean isPrime(int number) {
        if (number == 1)
            return false;

        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}
