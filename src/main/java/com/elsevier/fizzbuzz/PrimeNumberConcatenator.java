package com.elsevier.fizzbuzz;

public class PrimeNumberConcatenator {

    private static final String WHIZZ = "Whizz";
    private final PrimeNumberService primeNumberService;

    public PrimeNumberConcatenator(PrimeNumberService primeNumberService) {
        this.primeNumberService = primeNumberService;
    }

    public CompositeObject process(CompositeObject compositeObj) {
        boolean isPrime = primeNumberService.isPrime(compositeObj.getIndex());
        if (isPrime)
            return new CompositeObject(compositeObj.getIndex(), compositeObj.getValue() + WHIZZ);

        return compositeObj;
    }
}
