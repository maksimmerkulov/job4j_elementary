package ru.job4j.array;

/**
 * Класс {@code ArrayDefinition} демонстрирует объявление, инициализацию и вывод массивов в Java.
 *
 * <p>Используется для практики базовых операций с массивами, включая определение длины
 * и вывод содержимого массива строк.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ArrayDefinition.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Размер массива ages равен: 10
 * Размер массива surnames равен: 100500
 * Размер массива prices равен: 40
 *
 * Maksim Merkulov
 * James Gosling
 * Josh Bloch
 * Herbert Schildt
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class ArrayDefinition {

    /**
     * Выполняет демонстрацию работы с массивами.
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