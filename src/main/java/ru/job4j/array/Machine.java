package ru.job4j.array;

import java.util.Arrays;

/**
 * Provides a method to calculate change for a vending machine.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Machine {

    /**
     * Calculates the minimum number of coins needed to return change.
     *
     * @param money the amount of money given by the customer
     * @param price the price of the product
     * @return an array of coins representing the change
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                money -= coin;
                result[size++] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
