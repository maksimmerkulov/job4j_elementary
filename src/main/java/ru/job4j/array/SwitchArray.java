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
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] data = {1, 2, 3};
 * SwitchArray.swap(data, 0, 2);
 * SwitchArray.swapBorder(data);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 6
 * 2
 * 3
 * 4
 * 5
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SwitchArray {

    /**
     * Меняет местами два элемента в переданном массиве.
     *
     * <p>Выполняет перестановку значений по индексам {@code source} и {@code destination}.</p>
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
     * Меняет местами первый и последний элементы массива.
     *
     * <p>Если массив пустой или состоит из одного элемента, изменений не происходит.</p>
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
     * Демонстрирует работу метода {@link #swapBorder(int[])}.
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