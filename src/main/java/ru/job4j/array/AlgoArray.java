package ru.job4j.array;

/**
 * Класс {@code AlgoArray} демонстрирует сортировку массива методом ручных
 * перестановок.
 *
 * <p>В данном примере элементы массива меняются местами вручную без
 * использования стандартных алгоритмов сортировки. Итоговый массив
 * отсортирован по возрастанию.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] array = new int[] {5, 3, 2, 1, 4};
 * int temp = array[0];
 * array[0] = array[3];
 * array[3] = temp;
 * temp = array[1];
 * array[1] = array[2];
 * array[2] = temp;
 * temp = array[3];
 * array[3] = array[4];
 * array[4] = temp;
 * for (int element : array) {
 *     System.out.println(element);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 1
 * 2
 * 3
 * 4
 * 5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class AlgoArray {

    /**
     * Точка входа в программу.
     *
     * <p>Выполняет сортировку массива по возрастанию.</p>
     *
     * @param args аргументы командной строки (не используются)
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
