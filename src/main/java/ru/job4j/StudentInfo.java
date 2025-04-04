package ru.job4j;

/**
 * Класс {@code StudentInfo} предназначен для вывода в консоль имени студента и его даты рождения.
 *
 * <p>Программа выводит две строки:</p>
 * <ul>
 *     <li>Имя студента.</li>
 *     <li>Дату его рождения в формате {@code dd.MM.yyyy}.</li>
 * </ul>
 *
 * <p>Пример вывода:</p>
 * <pre>
 * Maksim Merkulov
 * 03.08.1987
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-12
 */
public class StudentInfo {

    /**
     * Метод {@code main(String[] args)} выводит в консоль имя студента и его дату рождения.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        System.out.println("Maksim Merkulov");
        System.out.println("03.08.1987");
    }
}