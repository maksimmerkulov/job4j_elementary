package ru.job4j.array;

/**
 * Класс AlgoArray предназначен для сортировки массива методом перестановки элементов.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class AlgoArray {

    /**
     * Метод main выполняет сортировку массива по возрастанию.
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int element : array) {
            System.out.println(element);
        }
    }
}