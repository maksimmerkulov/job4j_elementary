package ru.job4j.array;

/**
 * Класс {@code TwoPointersSquareSort} обрабатывает массив согласно условию:
 * - Если есть отрицательные числа, массив сначала разворачивается, затем
 *   каждый элемент возводится в квадрат.
 * - Если отрицательных чисел нет, массив сначала возводится в квадрат,
 *   затем разворачивается.
 *
 * <p>Включает методы для:</p>
 * <ul>
 *   <li>Проверки на наличие отрицательных чисел.</li>
 *   <li>Разворота массива с использованием двух указателей.</li>
 *   <li>Возведения элементов массива в квадрат.</li>
 * </ul>
 *
 * <p>Пример использования:</p>
 * <pre>{@code
 * int[] arr1 = {1, 2, 3};
 * TwoPointersSquareSort.processArray(arr1);
 *
 * int[] arr2 = {-1, 2, -3};
 * TwoPointersSquareSort.processArray(arr2);
 * }</pre>
 *
 * <p>Пример вывода:</p>
 * <pre>{@code
 * 9 4 1
 * 9 4 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TwoPointersSquareSort {

    /**
     * Обрабатывает массив согласно условию задачи.
     *
     * <p>Если массив содержит отрицательные числа, сначала разворачиваем его,
     * затем возводим элементы в квадрат. Иначе сначала возводим элементы в
     * квадрат, а затем разворачиваем массив.</p>
     *
     * @param arr входной массив для обработки
     */
    public static void processArray(int[] arr) {
        if (containsNegative(arr)) {
            reverseArray(arr);
            squareArray(arr);
        } else {
            squareArray(arr);
            reverseArray(arr);
        }
    }

    /**
     * Проверяет, содержит ли массив отрицательные числа.
     *
     * @param arr массив для проверки
     * @return {@code true}, если хотя бы один элемент меньше 0,
     *         иначе {@code false}
     */
    public static boolean containsNegative(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Разворачивает массив с использованием метода двух указателей.
     *
     * @param arr массив, который нужно развернуть
     */
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Возводит все элементы массива в квадрат.
     *
     * @param arr массив, элементы которого возводятся в квадрат
     */
    public static void squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
