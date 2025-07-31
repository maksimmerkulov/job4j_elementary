package ru.job4j.loop;

/**
 * Calculates time needed for Ivan to overtake Nikolay in pulling power.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Fitness {

    /**
     * Calculates months required for Ivan to overtake Nikolay.
     *
     * @param ivan Ivan's initial pulling power
     * @param nik Nikolay's initial pulling power
     * @return number of months
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
