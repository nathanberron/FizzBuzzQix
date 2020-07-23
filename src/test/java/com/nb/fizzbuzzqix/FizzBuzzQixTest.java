package com.nb.fizzbuzzqix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzQixTest {

    @Test
    public void shouldBeDivisibleBy3() {
        String expected = "Foo";
        int numberToEvaluate = 6;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldContain3() {
        String expected = "Foo";
        int numberToEvaluate = 13;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleBy5() {
        String expected = "Bar";
        int numberToEvaluate = 10;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldContain5() {
        String expected = "Bar";
        int numberToEvaluate = 151;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleBy7() {
        String expected = "Qix";
        int numberToEvaluate = 14;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldContain7() {
        String expected = "Qix";
        int numberToEvaluate = 71;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleAndContain3() {
        String expected = "FooFoo";
        int numberToEvaluate = 3;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleAndContain5() {
        String expected = "BarBar";
        int numberToEvaluate = 5;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleAndContain7() {
        String expected = "QixQix";
        int numberToEvaluate = 7;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleBy3AndBy5AndContains5() {
        String expected = "FooBarBar";
        int numberToEvaluate = 15;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeDivisibleBy5AndBy7AndContains3AndContains5() {
        String expected = "BarQixFooBar";
        int numberToEvaluate = 35;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldHaveHighPrecedenceForDivisors() {
        String expected = "FooBar";
        int numberToEvaluate = 51;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldBeInAppearanceOrder() {
        String expected = "BarFoo";
        int numberToEvaluate = 53;
        assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnNumberOutOfFooBarQix() {
        List<Integer> listOfNumbersToEvaluate = Arrays.asList(1,2,4,8);
        listOfNumbersToEvaluate.forEach(
                numberToEvaluate -> assertThat(FizzBuzzQix.fizzBuzzQixTransformation(numberToEvaluate))
                        .isEqualTo(String.valueOf(numberToEvaluate))
        );

    }
}
