package ru.job4j.array;

/**
 * Класс TwoPointersSquareSort содержит методы для обработки массива согласно следующему условию:
 * - Если массив содержит отрицательные числа, сначала происходит разворот массива, а затем возведение каждого
 *   элемента в квадрат.
 * - Если отрицательных чисел нет, сначала происходит возведение каждого элемента в квадрат, а затем разворот
 *   массива.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class TwoPointersSquareSort {

    /**
     * Метод processArray обрабатывает массив согласно условию задачи:
     * - Если массив содержит отрицательные числа, сначала разворачиваем его,
     *   затем возводим каждый элемент в квадрат.
     * - Если отрицательных нет, сначала возводим в квадрат, затем разворачиваем.
     *
     * @param arr Входной массив.
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
     * Метод containsNegative проверяет, содержит ли массив отрицательные числа.
     *
     * @param arr Входной массив.
     * @return Значение true, если хотя бы один элемент меньше 0, иначе false.
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
     * Метод reverseArray разворачивает массив с использованием двух указателей.
     *
     * @param arr Входной массив.
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
     * Метод squareArray возводит каждый элемент массива в квадрат.
     *
     * @param arr Входной массив.
     */
    public static void squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
