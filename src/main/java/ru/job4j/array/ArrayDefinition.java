package ru.job4j.array;

/**
 * Класс {@code ArrayDefinition} демонстрирует объявление, инициализацию
 * и вывод массивов в Java.
 *
 * <p>Используется для практики базовых операций с массивами, включая
 * определение длины и вывод содержимого массива строк.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * short[] ages = new short[10];
 * String[] surnames = new String[100500];
 * float[] prices = new float[40];
 * String[] names = new String[4];
 * names[0] = "James Gosling";
 * names[1] = "Patrick Naughton";
 * names[2] = "Mike Sheridan";
 * names[3] = "Chris Warth";
 *
 * System.out.println("Размер массива ages равен: " + ages.length);
 * System.out.println("Размер массива surnames равен: " + surnames.length);
 * System.out.println("Размер массива prices равен: " + prices.length);
 *
 * for (int i = 0; i < names.length; i++) {
 *     System.out.println(names[i]);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Размер массива ages равен: 10
 * Размер массива surnames равен: 100500
 * Размер массива prices равен: 40
 *
 * James Gosling
 * Patrick Naughton
 * Mike Sheridan
 * Chris Warth
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class ArrayDefinition {

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует создание массивов, вывод их размеров и элементов
     * массива с именами известных программистов.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "James Gosling";
        names[1] = "Patrick Naughton";
        names[2] = "Mike Sheridan";
        names[3] = "Chris Warth";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
