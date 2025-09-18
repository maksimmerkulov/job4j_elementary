package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Machine} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MachineTest {

    /**
     * Verifies that {@link Machine#change(int, int)} returns an empty array
     * when the amount equals the price.
     */
    @Test
    void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that {@link Machine#change(int, int)} returns coins
     * {@code {10, 5}} for a change of {@code 15}.
     */
    @Test
    void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that {@link Machine#change(int, int)} returns coins
     * {@code {10, 10, 5, 2, 2}} for a change of {@code 29}.
     */
    @Test
    void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that {@link Machine#change(int, int)} returns coins
     * {@code {10, 5, 2, 1}} for a change of {@code 18}.
     */
    @Test
    void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
