package ru.job4j.loop;

/**
 * Calculates the time required for one athlete to surpass another in strength.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fitness {

    /**
     * Calculates the number of months Ivan needs to surpass Nikolay.
     *
     * @param ivan initial strength of Ivan
     * @param nik  initial strength of Nikolay
     * @return the number of months
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
