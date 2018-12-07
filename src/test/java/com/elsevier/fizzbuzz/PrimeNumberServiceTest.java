package com.elsevier.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumberServiceTest {

    private PrimeNumberService primeNumberService;

    @Before
    public void setUp() {
        primeNumberService = new PrimeNumberService();
    }

    @Test
    @Parameters({"2, true", "3, true", "5, true", "7, true"})
    public void shouldReturnTrueForAListOfPrimes(int number, boolean result) {
        assertThat(primeNumberService.isPrime(number), equalTo(result));
    }

    @Test
    @Parameters({"1, false", "4, false", "6, false", "8, false"})
    public void shouldReturnFalseForAListOfNonPrimes(int number, boolean result) {
        assertThat(primeNumberService.isPrime(number), equalTo(result));
    }

}
