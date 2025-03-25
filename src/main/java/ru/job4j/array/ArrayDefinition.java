package ru.job4j.array;

/**
 * Класс ArrayDefinition демонстрирует объявление, инициализацию и вывод массивов в Java.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ArrayDefinition {

    /**
     * Метод main выполняет демонстрацию работы с массивами.
     * Создаются массивы различных типов, выводится их длина,
     * а затем выводится содержимое массива строк.
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Maksim Merkulov";
        names[1] = "James Gosling";
        names[2] = "Josh Bloch";
        names[3] = "Herbert Schildt";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
