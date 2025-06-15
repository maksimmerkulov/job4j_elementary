package ru.job4j.loop;

/**
 * Класс {@code LoopFor} демонстрирует работу цикла {@code for}.
 *
 * <p>Выводит в консоль целые числа от 5 до 10 включительно.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class LoopFor {

    /**
     * Выполняет цикл {@code for} для вывода чисел от 5 до 10 включительно.
     *
     * <p>Внутри цикла переменная {@code i} начинается с 5 и увеличивается до 10 включительно.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }
}