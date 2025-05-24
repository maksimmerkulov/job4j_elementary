package ru.job4j.array;

/**
 * Класс {@code AlgoArray} демонстрирует сортировку массива методом ручных перестановок.
 *
 * <p>В данном примере элементы массива меняются местами вручную без использования стандартных алгоритмов сортировки.
 * Итоговый массив отсортирован по возрастанию.</p>
 *
 * <p>Исходный массив: {@code {5, 3, 2, 1, 4}}</p>
 * <p>Результат после перестановок: {@code {1, 2, 3, 4, 5}}</p>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class AlgoArray {

    /**
     * Выполняет сортировку массива по возрастанию.
     *
     * @param args Аргументы командной строки (не используются).
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