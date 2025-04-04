package ru.job4j.loop;

/**
 * Класс {@code LoopFor} демонстрирует работу цикла {@code for}.
 *
 * <p>Выполняет вывод чисел от 5 до 10 включительно.</p>
 *
 * <p>Пример работы:</p>
 * <pre>
 *     5
 *     6
 *     7
 *     8
 *     9
 *     10
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-18
 */
public class LoopFor {

    /**
     * Метод {@code main(String[] args)} выполняет цикл {@code for} для вывода чисел от 5 до 10 включительно.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }
}