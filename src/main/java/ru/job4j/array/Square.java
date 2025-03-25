package ru.job4j.array;

/**
 * Класс Square предназначен для заполнения массива числами, возведенными в квадрат.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Square {

    /**
     * Метод calculate заполняет массив квадратами чисел от 0 до bound - 1.
     *
     * @param bound Верхняя граница чисел (не включительно).
     * @return Массив, содержащий квадраты чисел от 0 до bound - 1.
     */
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * index;
        }
        return result;
    }

    /**
     * Метод main демонстрирует работу метода calculate.
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
