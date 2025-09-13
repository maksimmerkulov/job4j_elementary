package ru.job4j.array;

/**
 * A utility class that verifies the consistency of character array prefixes.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ArrayChar {

    /**
     * Checks if the array {@code word} starts with the {@code prefix}.
     *
     * @param word   the array to check
     * @param prefix the prefix to find
     * @return {@code true} if the word starts with the prefix,
     *         otherwise {@code false}
     */
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
