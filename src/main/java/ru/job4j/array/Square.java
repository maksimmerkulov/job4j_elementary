package ru.job4j.array;

/**
 * Класс {@code Square} предназначен для заполнения массива числами,
 * возведенными в квадрат.
 *
 * <p>Программа выполняет следующие шаги:</p>
 * <ul>
 *     <li>Создает массив размером {@code bound}.</li>
 *     <li>Заполняет массив квадратами чисел от {@code 0} до
 *     {@code bound - 1}.</li>
 *     <li>Возвращает заполненный массив.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] squares = Square.calculate(4);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 0
 * 1
 * 4
 * 9
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Square {

    /**
     * Заполняет массив квадратами чисел от {@code 0} до {@code bound - 1}.
     *
     * <p>Если {@code bound == 0}, будет возвращен пустой массив.</p>
     *
     * @param bound верхняя граница чисел (не включительно)
     * @return массив, содержащий квадраты чисел от {@code 0} до
     *         {@code bound - 1}
     */
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * index;
        }
        return result;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #calculate(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
