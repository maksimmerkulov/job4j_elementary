package ru.job4j.array;

/**
 * Класс {@code LengthArrayArrays} демонстрирует создание и использование двумерного массива
 * с вложенными массивами разной длины.
 *
 * <p>Используется для иллюстрации того, что каждый подмассив может иметь произвольную длину.
 * Выводит длину каждого вложенного массива в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * LengthArrayArrays.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Размер вложенного массива равен: 1
 * Размер вложенного массива равен: 2
 * Размер вложенного массива равен: 3
 * Размер вложенного массива равен: 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class LengthArrayArrays {

    /**
     * Создает двумерный массив, где у каждого подмассива разная длина,
     * и выводит размер каждого вложенного массива в консоль.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}