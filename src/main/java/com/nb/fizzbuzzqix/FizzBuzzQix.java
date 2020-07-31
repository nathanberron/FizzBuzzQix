package com.nb.fizzbuzzqix;

import java.util.Map;

public class FizzBuzzQix {

    private static final Map<Integer, String> FIZZBUZZQIXPOSSIBLERESULT = Map.of(
            3,"Foo",
            5,"Bar",
            7,"Qix"
    );

    private static String result;

    public static String fizzBuzzQixTransformation(final int numberToEvaluate) {

        String stringNumberToEvaluateRepresentation = String.valueOf(numberToEvaluate);
        result = "";

        FIZZBUZZQIXPOSSIBLERESULT.forEach(
                (key,value) -> result += returnOfModulo(numberToEvaluate,key)
        );

        /*result += returnOfModulo(numberToEvaluate,3);
        result += returnOfModulo(numberToEvaluate,5);
        result += returnOfModulo(numberToEvaluate,7);*/

        for (int i=0 , numLength=stringNumberToEvaluateRepresentation.length(); i < numLength; i++) {
            char carToEvaluate = stringNumberToEvaluateRepresentation.charAt(i);
            if (carToEvaluate == '3') result += "Foo";
            if (carToEvaluate == '5') result += "Bar";
            if (carToEvaluate == '7') result += "Qix";
        }

        if (result.equals(""))  result = stringNumberToEvaluateRepresentation;

        return result;

    }

    private static String returnOfModulo (final int numberToEvaluate, final int key) {
        if (numberToEvaluate % key == 0) return FIZZBUZZQIXPOSSIBLERESULT.get(key);
        return "";
    }

}
