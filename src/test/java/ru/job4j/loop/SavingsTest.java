package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link Savings} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class SavingsTest {

    /**
     * Verifies the savings period for the goal of 500.
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
     * Verifies the savings period for the goal of 1000 with 10 percent.
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
     * Verifies the savings period for the goal of 1000 with 20 percent.
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
