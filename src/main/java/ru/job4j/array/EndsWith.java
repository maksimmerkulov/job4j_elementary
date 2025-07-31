package ru.job4j.array;

/**
 * Checks if a character array ends with a specific postfix.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class EndsWith {

    /**
     * Checks if the word ends with the specified postfix.
     *
     * @param word character array to check
     * @param postfix character array to compare against
     * @return {@code true} if word ends with postfix, {@code false} otherwise
     */
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - i - 1]
                    != postfix[postfix.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
