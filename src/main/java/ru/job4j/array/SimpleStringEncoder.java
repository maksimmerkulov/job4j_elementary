package ru.job4j.array;

/**
 * Provides a simple string encoding algorithm based on character repetition.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SimpleStringEncoder {

    /**
     * Encodes repeated characters by adding their counts to the result.
     *
     * @param input the string to encode
     * @return encoded string
     */
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}
