package ru.job4j.array;

/**
 * Demonstrates basic operations with the {@link String} class.
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
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String first = "aaabvddrr";
        System.out.println("Length of string FIRST: " + first.length());
        String second = "aaabbbvdddrrr";
        System.out.println("Length of string SECOND: " + second.length());
        String third = "abbvdddr";
        System.out.println("Length of string THIRD: " + third.length());
        System.out.println();
        String input = "aaabbbvdddrrr";
        System.out.println("Symbol with index = 2: " + input.charAt(2));
        System.out.println("Symbol with index = 3: " + input.charAt(3));
        System.out.println("Symbol with index = 6: " + input.charAt(6));
        System.out.println("Symbol with index = 9: " + input.charAt(9));
        System.out.println("Symbol with index = 10: " + input.charAt(10));
    }
}
