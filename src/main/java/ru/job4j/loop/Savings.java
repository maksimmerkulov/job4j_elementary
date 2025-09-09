package ru.job4j.loop;

/**
 * Calculates savings accumulation over time.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Savings {

    /**
     * Calculates the number of years to reach the goal.
     *
     * @param goal          the target sum
     * @param annualDeposit annual replenishment amount
     * @param percent       annual interest rate
     * @return the number of years
     */
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total = total + annualDeposit + (total * percent / 100);
            years++;
        } while (total < goal);
        return years;
    }
}
