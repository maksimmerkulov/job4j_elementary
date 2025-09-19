package ru.job4j.array;

/**
 * Provides a method to encode strings by compressing repeated characters.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SimpleStringEncoder {

    /**
     * Encodes the input string by replacing duplicate consecutive characters
     * with the character and its count.
     *
     * @param input the string to be encoded
     * @return the encoded string
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
