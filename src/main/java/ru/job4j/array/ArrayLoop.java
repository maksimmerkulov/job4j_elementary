package ru.job4j.array;

/**
 * Класс {@code ArrayLoop} демонстрирует работу с массивами и циклами.
 *
 * <p>Программа выполняет следующие шаги:</p>
 * <ul>
 *     <li>Создает массив из 5 элементов.</li>
 *     <li>Заполняет массив значениями по формуле {@code y = index * 2 + 3}.</li>
 *     <li>Выводит значения массива в консоль.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ArrayLoop.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 3
 * 5
 * 7
 * 9
 * 11
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class ArrayLoop {

    /**
     * Создает массив, заполняет его значениями и выводит в консоль.
     *
     * <p>Заполнение выполняется с использованием формулы {@code y = index * 2 + 3},
     * затем значения выводятся с помощью цикла {@code for-each}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}