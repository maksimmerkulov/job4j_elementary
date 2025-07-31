package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Machine} class.
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
class MachineTest {

    /**
     * Verifies that when {@code money} equals {@code price},
     * no change is returned.
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
     * Verifies simple change: {@code money} is {@code 50},
     * {@code price} is {@code 35}, change should be {@code {10, 5}}.
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
     * Verifies more complex change: {@code money} is {@code 50},
     * {@code price} is {@code 21}, expected change is {@code {10, 10, 5, 2, 2}}.
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
     * Verifies change when {@code money} is {@code 50},
     * {@code price} is {@code 32}, expected change is {@code {10, 5, 2, 1}}.
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
