package ru.job4j.array;

/**
 * Checks if a character array starts with a specific prefix.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class ArrayChar {

    /**
     * Checks if the word begins with the specified prefix.
     *
     * @param word character array to check
     * @param prefix character array to compare against
     * @return {@code true} if word starts with prefix, {@code false} otherwise
     */
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
