package com.elsevier.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SequenceGeneratorTest {


    @Test
    public void generateFromOneToFive() {
        NumberFilter numberFilter = new NumberFilterStub();
        assertEquals(Arrays.asList("1", "2", "3", "4", "5"), new SequenceGenerator(numberFilter).generate(1, 5));
    }

    class NumberFilterStub implements NumberFilter {

        @Override
        public CompositeObject process(CompositeObject compositeObject) {
            return new CompositeObject(compositeObject.getIndex(), String.valueOf(compositeObject.getIndex()));
        }
    }
}
