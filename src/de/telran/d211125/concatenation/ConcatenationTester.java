package de.telran.d211125.concatenation;

public class ConcatenationTester {
    /**
     * Tests performance of the given concatenator by adding the string toConcat number times
     *
     * @param concatenator
     * @param toConcat
     * @param number
     * @return millis taken for the concatenation
     */
    public static long test(IConcatenator concatenator, String toConcat, int number) {
        // IConcatenator concatenator - паттерн называется "стратегия"
        // принимает строку и количество раз
        String[] strings = composeStrings(toConcat, number); // count millis from the start

        long StartTime = System.currentTimeMillis();
        concatenator.concat(strings);
        return System.currentTimeMillis() - StartTime;
    }

    private static String[] composeStrings(String toConcat, int number){ // static - чтоб можно было вызвать
        // create an array of length number, each element of which is toConcat

        String[] res = new String[number];
        for (int i = 0; i < res.length; i++) {
            res[i] = toConcat;
        }
        return res;
    }
}
