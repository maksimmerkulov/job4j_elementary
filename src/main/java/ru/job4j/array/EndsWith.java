package ru.job4j.array;

/**
 * Provides a utility method to verify character array postfixes.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class EndsWith {

    /**
     * Checks if the array {@code word} ends with {@code postfix}.
     *
     * @param word    the array to check
     * @param postfix the postfix to find
     * @return {@code true} if word ends with postfix, otherwise {@code false}
     */
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
