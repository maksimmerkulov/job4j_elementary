package ru.job4j.array;

/**
 * Класс {@code EqualLast} предназначен для проверки совпадения последних
 * элементов двух массивов.
 *
 * <p>Содержит метод {@link #check(int[], int[])}, который определяет, равны ли
 * последние элементы переданных массивов. Если хотя бы один из массивов пуст,
 * метод возвращает {@code false}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] a = {1, 2, 3};
 * int[] b = {7, 8, 3};
 * boolean result1 = EqualLast.check(a, b);
 *
 * int[] c = {1, 2};
 * int[] d = {2, 3};
 * boolean result2 = EqualLast.check(c, d);
 *
 * int[] e = {};
 * int[] f = {1};
 * boolean result3 = EqualLast.check(e, f);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result1 = true
 * result2 = false
 * result3 = false
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class EqualLast {

    /**
     * Проверяет, совпадают ли последние элементы двух массивов.
     *
     * <p>Если хотя бы один из массивов пуст, метод возвращает {@code false}.</p>
     *
     * @param left первый массив целых чисел
     * @param right второй массив целых чисел
     * @return {@code true}, если последние элементы массивов равны,
     *         иначе {@code false}
     */
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        return (left[left.length - 1] == right[right.length - 1]);
    }
}
