package ru.job4j.array;

/**
 * Класс {@code TwoPointersSquareSort} содержит методы для обработки массива согласно следующему условию:
 * - Если массив содержит отрицательные числа, сначала происходит разворот массива, а затем возведение каждого
 *   элемента в квадрат.
 * - Если отрицательных чисел нет, сначала происходит возведение каждого элемента в квадрат, а затем разворот
 *   массива.
 *
 * <p>Класс включает в себя методы для:</p>
 * <ul>
 *   <li>Проверки на наличие отрицательных чисел в массиве.</li>
 *   <li>Разворота массива с использованием двух указателей.</li>
 *   <li>Возведения каждого элемента массива в квадрат.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-24
 */
public class TwoPointersSquareSort {

    /**
     * Метод {@code processArray(int[] arr)} обрабатывает массив согласно условию задачи:
     * - Если массив содержит отрицательные числа, сначала разворачиваем его,
     *   затем возводим каждый элемент в квадрат.
     * - Если отрицательных нет, сначала возводим в квадрат, затем разворачиваем.
     *
     * @param arr Входной массив, который нужно обработать.
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
     * Метод {@code containsNegative(int[] arr)} проверяет, содержит ли массив отрицательные числа.
     *
     * @param arr Входной массив для проверки.
     * @return {@code true}, если хотя бы один элемент массива меньше 0, иначе {@code false}.
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
     * Метод {@code reverseArray(int[] arr)} разворачивает массив с использованием двух указателей.
     *
     * <p>Алгоритм работает следующим образом:</p>
     * <ul>
     *   <li>Используются два указателя: один с начала массива, второй с конца.</li>
     *   <li>Элементы на этих позициях меняются местами до тех пор, пока указатели не пересекутся.</li>
     * </ul>
     *
     * @param arr Входной массив, который нужно развернуть.
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
     * Метод {@code squareArray(int[] arr)} возводит каждый элемент массива в квадрат.
     *
     * @param arr Входной массив, элементы которого необходимо возвести в квадрат.
     */
    public static void squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
