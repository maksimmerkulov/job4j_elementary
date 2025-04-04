package ru.job4j.array;

/**
 * Класс {@code Sequence} демонстрирует создание и инициализацию двумерного массива размером 3x3.
 * <p>
 * В массиве элементы заполняются последовательными числами от 1 до 9.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class Sequence {

    /**
     * Метод {@code main(String[] args)} создает двумерный массив 3x3 и инициализирует его значениями
     * от 1 до 9 в порядке следования слева направо и сверху вниз.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
    }
}