package com.nb.fizzbuzzqix;

public class FizzBuzzQixMain {

    public static void main(String[] args) {

        FizzBuzzQix fizzBuzzQix = new FizzBuzzQix();

        for (int i=0; i<=100; i++) {
            System.out.println(fizzBuzzQix.fizzBuzzQixTransformation(i));
        }
    }
}
