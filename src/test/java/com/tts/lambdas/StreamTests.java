package com.tts.lambdas;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamTests {
    @Test
    public void sumIntegersInArray() {
        int[] numbers = {3, 1, 4, 1, 5, 9};
        int sum = Arrays.stream(numbers).sum();
        assertEquals(23, sum);
    }

    @Test
    public void sumBigInteger() {
        BigInteger total = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE))
                .limit(10)
                .reduce(BigInteger.ZERO, (accumulator, y) -> {
                    System.out.println("accumulator = " + accumulator + ", y = " + y);
                    return accumulator.add(y);
                });

        System.out.println(total);
    }

    @Test
    public void sumBigDecimal() {
        BigDecimal total = Stream.iterate(BigDecimal.ZERO, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .reduce(BigDecimal.ZERO, (accumulator, y) -> {
                    System.out.println("accumulator = " + accumulator + ", y = " + y);
                    return accumulator.add(y);
                });

        System.out.println(total);
    }
}
