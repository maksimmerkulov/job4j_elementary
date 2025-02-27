package ru.job4j.array;

/**
 * Класс Square заполняет массив числами, возведенными в квадрат.
 */
public class Square {

    /**
     * Метод заполняет массив квадратами чисел от 0 до bound - 1.
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
     * Основной метод программы. Демонстрирует работу метода calculate.
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
