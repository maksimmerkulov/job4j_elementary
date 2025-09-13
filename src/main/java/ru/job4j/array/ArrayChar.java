package ru.job4j.array;

/**
 * Checks if a word starts with a specific prefix.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ArrayChar {

    /**
     * Checks if the array {@code word} starts with {@code prefix}.
     *
     * @param word   the array to check
     * @param prefix the prefix to find
     * @return {@code true} if word starts with prefix, otherwise {@code false}
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
