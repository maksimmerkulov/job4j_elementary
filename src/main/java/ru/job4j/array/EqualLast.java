package ru.job4j.array;

/**
 * Класс {@code EqualLast} предназначен для проверки совпадения последних элементов двух массивов.
 *
 * <p>Содержит метод {@link #check(int[], int[])}, который определяет, равны ли последние
 * элементы переданных массивов. Если хотя бы один из массивов пуст, метод возвращает {@code false}.</p>
 *
 * <p>Примеры использования:</p>
 * <pre>
 * int[] first = {1, 2, 3};
 * int[] second = {7, 8, 3};
 * boolean result = EqualLast.check(first, second); true
 * </pre>
 * <pre>
 * int[] first = {1, 2, 3};
 * int[] second = {7, 8, 4};
 * boolean result = EqualLast.check(first, second); false
 * </pre>
 * <pre>
 * int[] first = {};
 * int[] second = {7, 8, 3};
 * boolean result = EqualLast.check(first, second); false
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class EqualLast {

    /**
     * Метод {@code check(int[] left, int[] right)} проверяет, совпадают ли последние элементы двух массивов.
     *
     * <p>Если хотя бы один из массивов пуст, метод возвращает {@code false}.</p>
     *
     * @param left  Первый массив целых чисел.
     * @param right Второй массив целых чисел.
     * @return {@code true}, если последние элементы массивов равны, иначе {@code false}.
     */
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        return (left[left.length - 1] == right[right.length - 1]);
    }
}