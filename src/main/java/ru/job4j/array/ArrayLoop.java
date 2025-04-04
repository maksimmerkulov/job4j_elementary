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
 * <p>Пример вывода:</p>
 * <pre>
 * 3
 * 5
 * 7
 * 9
 * 11
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-24
 */
public class ArrayLoop {

    /**
     * Метод {@code main(String[] args)} создает массив, заполняет его значениями и выводит в консоль.
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
