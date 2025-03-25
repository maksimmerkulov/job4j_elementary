package ru.job4j.array;

/**
 * Класс EqualLast предназначен для сравнения последних элементов двух массивов.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class EqualLast {

    /**
     * Метод check проверяет, совпадают ли последние элементы двух массивов.
     *
     * @param left  Первый массив целых чисел.
     * @param right Второй массив целых чисел.
     * @return Значение true, если последние элементы массивов равны, иначе false.
     */
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        return (left[left.length - 1] == right[right.length - 1]);
    }
}