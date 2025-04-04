package ru.job4j.array;

/**
 * Класс {@code Square} предназначен для заполнения массива числами, возведенными в квадрат.
 *
 * <p>Программа выполняет следующие шаги:</p>
 * <ul>
 *     <li>Создает массив размером {@code bound}.</li>
 *     <li>Заполняет массив квадратами чисел от {@code 0} до {@code bound - 1}.</li>
 *     <li>Возвращает заполненный массив.</li>
 * </ul>
 *
 * <p>Пример использования:</p>
 * <pre>
 * int[] array = Square.calculate(4);
 * array: [0, 1, 4, 9]
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-24
 */
public class Square {

    /**
     * Метод {@code calculate(int bound)} заполняет массив квадратами чисел от {@code 0} до {@code bound - 1}.
     *
     * @param bound Верхняя граница чисел (не включительно).
     * @return Массив, содержащий квадраты чисел от {@code 0} до {@code bound - 1}.
     */
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * index;
        }
        return result;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #calculate(int)},
     * выводя результат в консоль.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
