package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SavingsTest {
    @Test
    void whenGoal500Deposit100Percent5ThenYears5() {
        double goal = 500;
        double annualDeposit = 100;
        double percent = 5;
        int expected = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal1000Deposit200Percent10ThenYears5() {
        double goal = 1000;
        double annualDeposit = 200;
        double percent = 10;
        int expected = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal1000Deposit100Percent20ThenYears7() {
        double goal = 1000;
        double annualDeposit = 100;
        double percent = 20;
        int expected = 7;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }
}
