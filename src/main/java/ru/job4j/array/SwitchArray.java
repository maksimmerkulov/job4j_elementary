package ru.job4j.array;

/**
 * Класс SwitchArray содержит методы для обмена элементов в массиве.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SwitchArray {

    /**
     * Метод меняет местами два элемента массива.
     *
     * @param array       Исходный массив.
     * @param source      Индекс первого элемента.
     * @param destination Индекс второго элемента.
     * @return Массив с измененными элементами.
     */
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    /**
     * Метод меняет местами первый и последний элементы массива.
     * Если массив пустой или состоит из одного элемента, изменений не происходит.
     *
     * @param array Исходный массив.
     * @return Массив с переставленными границами (или без изменений).
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Основной метод программы. Демонстрирует работу метода swapBorder.
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}