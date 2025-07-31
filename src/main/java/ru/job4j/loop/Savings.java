package ru.job4j.loop;

/**
 * Calculates the time required to reach a financial goal.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Savings {

    /**
     * Calculates the number of years needed to accumulate the target amount.
     *
     * @param goal the target amount to save
     * @param annualDeposit the amount deposited each year
     * @param percent the annual interest rate as a percentage
     * @return the number of years required
     */
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total += total * (percent / 100);
            total += annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }
}
