package com.nb.fizzbuzzqix;

public class FizzBuzzQix {

    public static String fizzBuzzQixTransformation(int numberToEvaluate) {

        String stringNumberToEvaluateRepresentation = String.valueOf(numberToEvaluate);
        String result = "";

        if ((numberToEvaluate % 3) == 0) {
            result += "Foo";
        }
        if ((numberToEvaluate % 5) == 0) {
            result += "Bar";
        }
        if ((numberToEvaluate % 7) == 0) {
            result += "Qix";
        }

        for (int i=0 ; i < stringNumberToEvaluateRepresentation.length(); i++) {
            char carToEvaluate = stringNumberToEvaluateRepresentation.charAt(i);
            if (carToEvaluate == '3') {
                result += "Foo";
            }
            if (carToEvaluate == '5') {
                result += "Bar";
            }
            if (carToEvaluate == '7') {
                result += "Qix";
            }
        }
        if (result.equals(""))  result = stringNumberToEvaluateRepresentation;

        return result;

    }
}
