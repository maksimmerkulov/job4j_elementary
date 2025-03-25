package ru.job4j.array;

/**
 * Класс LengthArrayArrays демонстрирует создание двумерного массива с разным количеством элементов
 * в каждом вложенном массиве.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class LengthArrayArrays {

    /**
     * Метод main создает двумерный массив, в котором у каждого вложенного массива своя длина,
     * и выводит в консоль размер каждого вложенного массива.
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