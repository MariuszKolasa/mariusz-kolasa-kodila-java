package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        if (numbers.length==0){
        return 0.0;
        }else {

        IntStream.range(0, numbers.length)
            .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
            .average().
                    getAsDouble();
        }

    }
}
