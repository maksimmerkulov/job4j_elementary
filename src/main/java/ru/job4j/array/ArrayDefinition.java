package ru.job4j.array;

/**
 * Класс демонстрирует объявление, инициализацию и вывод массивов в Java.
 */
public class ArrayDefinition {
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

        for (String name : names) {
            System.out.println(name);
        }
    }
}
