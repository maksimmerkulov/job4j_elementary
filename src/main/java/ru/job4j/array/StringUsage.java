package ru.job4j.array;

/**
 * Demonstrates basic String length and character access by index.
 *
 * <p>Example output:
 * <pre>{@code
 * Length of string FIRST: 9
 * Length of string SECOND: 13
 * Length of string THIRD: 8
 *
 * Symbol with index = 2: a
 * Symbol with index = 3: b
 * Symbol with index = 6: v
 * Symbol with index = 9: r
 * Symbol with index = 10: r
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StringUsage {

    /**
     * Prints lengths of predefined strings.
     */
    public static void printStringLengths() {
        String first = "aaabvddrr";
        String second = "aaabbbvdddrrr";
        String third = "abbvdddr";
        System.out.println("Length of string FIRST: " + first.length());
        System.out.println("Length of string SECOND: " + second.length());
        System.out.println("Length of string THIRD: " + third.length());
    }

    /**
     * Prints specific characters from a string using their indices.
     */
    public static void printCharsByIndex() {
        String input = "aaabbbvdddrrr";
        System.out.println("Symbol with index = 2: " + input.charAt(2));
        System.out.println("Symbol with index = 3: " + input.charAt(3));
        System.out.println("Symbol with index = 6: " + input.charAt(6));
        System.out.println("Symbol with index = 9: " + input.charAt(9));
        System.out.println("Symbol with index = 10: " + input.charAt(10));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        printStringLengths();
        System.out.println();
        printCharsByIndex();
    }
}
