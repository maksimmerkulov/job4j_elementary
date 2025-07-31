package ru.job4j.string;

/**
 * Provides utility methods for string transformations.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class OneSwapDifference {

    /**
     * Checks if {@code word1} can be transformed into {@code word2} by swapping
     * exactly two characters in {@code word1}.
     *
     * @param word1 the first string to compare
     * @param word2 the second string to compare
     * @return {@code true} if exactly one swap makes strings equal,
     *         {@code false} otherwise
     */
    public static boolean canTransform(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int first = -1;
        int second = -1;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }
        if (second == -1) {
            return false;
        }
        return word1.charAt(first) == word2.charAt(second)
                && word1.charAt(second) == word2.charAt(first);
    }
}
