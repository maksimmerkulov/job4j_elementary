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
     * Точка входа в программу.
     *
     * <p>Выполняет цикл {@code for}, выводящий числа от 5 до 10 включительно.</p>
     *
     * <p>Переменная {@code i} инициализируется значением 5 и увеличивается
     * на единицу, пока не достигнет 10.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
