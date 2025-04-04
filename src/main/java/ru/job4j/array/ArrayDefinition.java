package ru.job4j.array;

/**
 * Класс {@code ArrayDefinition} демонстрирует объявление, инициализацию и вывод массивов в Java.
 *
 * <p>В методе {@link #main(String[])} создаются массивы различных типов данных, выводится их длина,
 * а затем содержимое массива строк.</p>
 *
 * <p>Пример работы с массивом строк:</p>
 * <pre>
 * Maksim Merkulov
 * James Gosling
 * Josh Bloch
 * Herbert Schildt
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @since 2025-02-22
 */
public class ArrayDefinition {

    /**
     * Метод {@code main(String[] args)} выполняет демонстрацию работы с массивами.
     *
     * <p>Создаются массивы следующих типов:</p>
     * <ul>
     *     <li>{@code short[]} - массив из 10 элементов</li>
     *     <li>{@code String[]} - массив из 100500 элементов</li>
     *     <li>{@code float[]} - массив из 40 элементов</li>
     *     <li>{@code String[]} - массив из 4 элементов, содержащий имена известных специалистов</li>
     * </ul>
     *
     * <p>Выводится длина каждого массива, а затем элементы массива с именами.</p>
     *
     * @param args Аргументы командной строки (не используются).
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
