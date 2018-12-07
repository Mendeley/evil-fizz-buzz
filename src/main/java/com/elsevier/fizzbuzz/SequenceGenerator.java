package com.elsevier.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceGenerator {
    private final NumberFilter numberFilter;

    public SequenceGenerator(NumberFilter numberFilter) {
        this.numberFilter = numberFilter;
    }

    public List<String> generate(int start, int end) {
        return IntStream.range(start, end + 1)
                .mapToObj(this::createCompositeObject)
                .map(numberFilter::process)
                .map(CompositeObject::getValue)
                .collect(Collectors.toList());
    }

    private CompositeObject createCompositeObject(int i) {
        return new CompositeObject(i, "");
    }
}
