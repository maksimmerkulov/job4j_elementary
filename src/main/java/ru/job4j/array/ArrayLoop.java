package ru.job4j.array;

/**
 * Класс ArrayLoop демонстрирует работу с массивами и циклами.
 * Заполняет массив значениями по формуле y = index * 2 + 3 и выводит их в консоль.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ArrayLoop {

    /**
     * Метод main создает массив, заполняет его значениями и выводит их в консоль.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
