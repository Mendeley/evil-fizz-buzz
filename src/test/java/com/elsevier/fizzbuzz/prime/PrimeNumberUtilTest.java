package com.elsevier.fizzbuzz.prime;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumberUtilTest {

    private PrimeNumberUtil primeNumberUtil;

    @Before
    public void setUp() {
        primeNumberUtil = new PrimeNumberUtil();
    }

    @Test
    @Parameters({"2, true", "3, true", "5, true", "7, true"})
    public void shouldReturnTrueForAListOfPrimes(int number, boolean result) {
        assertThat(primeNumberUtil.isPrime(number), equalTo(result));
    }

    @Test
    @Parameters({"1, false", "4, false", "6, false", "8, false"})
    public void shouldReturnFalseForAListOfNonPrimes(int number, boolean result) {
        assertThat(primeNumberUtil.isPrime(number), equalTo(result));
    }

}
