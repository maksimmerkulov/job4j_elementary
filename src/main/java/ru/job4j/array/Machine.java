package ru.job4j.array;

import java.util.Arrays;

/**
 * Calculates the change to be returned by a vending machine.
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class Machine {

    /**
     * Calculates the minimum number of coins for the change.
     *
     * <p>Uses greedy algorithm with coin denominations: {@code 10, 5, 2, 1}.
     *
     * @param money amount received
     * @param price price of the item
     * @return array of coins to return as change
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                result[size++] = coin;
                money -= coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
