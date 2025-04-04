package ru.job4j.array;

/**
 * Класс {@code SwitchArray} содержит методы для обмена элементов в массиве.
 *
 * <p>Основные методы:</p>
 * <ul>
 *     <li>{@link #swap(int[], int, int)} — меняет местами два элемента массива по индексам.</li>
 *     <li>{@link #swapBorder(int[])} — меняет местами первый и последний элементы массива.</li>
 * </ul>
 *
 * <p>Класс предназначен для демонстрации базовых операций перестановки элементов в массиве.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-25
 */
public class SwitchArray {

    /**
     * Метод {@code swap(int[] array, int source, int destination)} меняет местами два элемента в переданном массиве.
     *
     * <p>Метод выполняет перестановку значений по индексам {@code source} и {@code destination}.</p>
     * <p>Если индексы выходят за границы массива, будет выброшено {@link ArrayIndexOutOfBoundsException}.</p>
     *
     * @param array       Исходный массив, в котором происходит замена.
     * @param source      Индекс первого элемента.
     * @param destination Индекс второго элемента.
     * @return Тот же массив с измененными элементами.
     * @throws ArrayIndexOutOfBoundsException если переданы некорректные индексы.
     */
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    /**
     * Метод {@code swapBorder(int[] array)} меняет местами первый и последний элементы массива.
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
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #swapBorder(int[])}.
     *
     * <p>Выводит результат работы метода в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}