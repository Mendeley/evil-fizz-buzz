package com.elsevier.fizzbuzz.prime;

import com.elsevier.fizzbuzz.CompositeObject;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrimeNumberFilterTest {

    private PrimeNumberFilter primeNumberFilter;
    private PrimeNumberUtil primeNumberUtil;

    @Before
    public void setUp() {
        primeNumberUtil = mock(PrimeNumberUtil.class);
        primeNumberFilter = new PrimeNumberFilter(primeNumberUtil);
    }

    @Test
    public void shouldAppendWhizzToPrimeNumbers() {
        int number = 2;
        CompositeObject compositeObj = new CompositeObject(number, "2");

        when(primeNumberUtil.isPrime(number)).thenReturn(true);

        CompositeObject expectedObj = primeNumberFilter.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("2Whizz"));
    }

    @Test
    public void shouldNotAppendWhizzToSimpleNumbers() {
        int number = 4;
        CompositeObject compositeObj = new CompositeObject(number, "4");

        when(primeNumberUtil.isPrime(number)).thenReturn(false);

        CompositeObject expectedObj = primeNumberFilter.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("4"));
    }

    @Test
    public void shouldNotAppendWhizzToFizzBuzzNumbersNotPrime() {
        int number = 4;
        CompositeObject compositeObj = new CompositeObject(number, "FizzBuzz");

        when(primeNumberUtil.isPrime(number)).thenReturn(false);

        CompositeObject expectedObj = primeNumberFilter.process(compositeObj);

        assertThat(expectedObj.getValue(), equalTo("FizzBuzz"));
    }
}
