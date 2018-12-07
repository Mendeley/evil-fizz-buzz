package com.elsevier.fizzbuzz.prime;

import com.elsevier.fizzbuzz.CompositeObject;
import com.elsevier.fizzbuzz.NumberFilter;

public class PrimeNumberFilter implements NumberFilter {

    private static final String WHIZZ = "Whizz";
    private final PrimeNumberUtil primeNumberUtil;

    public PrimeNumberFilter(PrimeNumberUtil primeNumberUtil) {
        this.primeNumberUtil = primeNumberUtil;
    }

    public CompositeObject process(CompositeObject compositeObj) {
        boolean isPrime = primeNumberUtil.isPrime(compositeObj.getIndex());
        if (isPrime)
            return new CompositeObject(compositeObj.getIndex(), compositeObj.getValue() + WHIZZ);

        return compositeObj;
    }
}
