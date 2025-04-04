package ru.job4j.array;

/**
 * Класс {@code AlgoArray} демонстрирует сортировку массива методом ручных перестановок.
 *
 * <p>В данном примере элементы массива меняются местами вручную без использования стандартных алгоритмов сортировки.
 * Итоговый массив отсортирован по возрастанию.</p>
 *
 * <p>Исходный массив: {5, 3, 2, 1, 4}</p>
 * <p>Результат после перестановок: {1, 2, 3, 4, 5}</p>
 *
 * <p>Пример вывода:</p>
 * <pre>
 * 1
 * 2
 * 3
 * 4
 * 5
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-25
 */
public class AlgoArray {

    /**
     * Метод {@code main(String[] args)} выполняет сортировку массива по возрастанию.
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