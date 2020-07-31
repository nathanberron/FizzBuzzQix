package com.nb.fizzbuzzqix;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzzQix {

    private static final Map<Integer, String> FIZZBUZZQIXEXPECTEDRESULT = new LinkedHashMap<Integer, String>();
    private static String result;

    public static String fizzBuzzQixTransformation(final int numberToEvaluate) {

        FIZZBUZZQIXEXPECTEDRESULT.put( 3,"Foo");
        FIZZBUZZQIXEXPECTEDRESULT.put( 5,"Bar");
        FIZZBUZZQIXEXPECTEDRESULT.put( 7,"Qix");

        String stringNumberToEvaluateRepresentation = String.valueOf(numberToEvaluate);
        result = "";

        FIZZBUZZQIXEXPECTEDRESULT.forEach(
                (key,value) -> result += returnOfModulo(numberToEvaluate,key)
        );

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
        if (numberToEvaluate % key == 0) return FIZZBUZZQIXEXPECTEDRESULT.get(key);
        return "";
    }

}
