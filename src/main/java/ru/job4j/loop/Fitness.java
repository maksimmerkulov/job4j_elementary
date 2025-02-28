package ru.job4j.loop;

/**
 * Класс Fitness вычисляет, за сколько месяцев Иван превзойдет Николая по силе тяги.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fitness {

    /**
     * Метод вычисляет количество месяцев, необходимых Ивану, чтобы обогнать Николая.
     *
     * @param ivan Начальная сила Ивана (в кг).
     * @param nik  Начальная сила Николая (в кг).
     * @return Количество месяцев.
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
