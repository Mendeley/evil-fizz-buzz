package com.elsevier.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrimeNumberServiceConcatenatorTest {

    private PrimeNumberConcatenator primeNumberConcatenator;
    private PrimeNumberService primeNumberService;

    @Before
    public void setUp() {
        primeNumberService = mock(PrimeNumberService.class);
        primeNumberConcatenator = new PrimeNumberConcatenator(primeNumberService);
    }

    @Test
    public void shouldAppendWhizzToPrimeNumbers() {
        int number = 2;
        CompositeObject compositeObj = new CompositeObject(number, "2");

        when(primeNumberService.isPrime(number)).thenReturn(true);

        CompositeObject expectedObj = primeNumberConcatenator.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("2Whizz"));
    }

    @Test
    public void shouldNotAppendWhizzToSimpleNumbers() {
        int number = 4;
        CompositeObject compositeObj = new CompositeObject(number, "4");

        when(primeNumberService.isPrime(number)).thenReturn(false);

        CompositeObject expectedObj = primeNumberConcatenator.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("4"));
    }

    @Test
    public void shouldNotAppendWhizzToFizzBuzzNumbersNotPrime() {
        int number = 4;
        CompositeObject compositeObj = new CompositeObject(number, "FizzBuzz");

        when(primeNumberService.isPrime(number)).thenReturn(false);

        CompositeObject expectedObj = primeNumberConcatenator.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("FizzBuzz"));
    }
}
