package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Savings} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class SavingsTest {

    /**
     * Verifies that savings period is {@code 5} years for goal {@code 500}.
     */
    @Test
    void whenGoal500Deposit100Percent5ThenYears5() {
        double goal = 500;
        double annualDeposit = 100;
        double percent = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that savings period is {@code 5} years for goal {@code 1000}.
     */
    @Test
    void whenGoal1000Deposit200Percent10ThenYears5() {
        double goal = 1000;
        double annualDeposit = 200;
        double percent = 10;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that savings period is {@code 7} years for goal {@code 1000}.
     */
    @Test
    void whenGoal1000Deposit100Percent20ThenYears7() {
        double goal = 1000;
        double annualDeposit = 100;
        double percent = 20;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
