package ru.job4j.array;

/**
 * Класс {@code MinDiapason} предназначен для поиска минимального значения
 * в заданном диапазоне индексов массива.
 *
 * <p>Метод класса позволяет найти минимальное значение в массиве в пределах
 * диапазона индексов, указанного пользователем.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] data = {5, 2, 10, 4, 1};
 * int min1 = MinDiapason.findMin(data, 0, 2);
 * int min2 = MinDiapason.findMin(data, 1, 4);
 *
 * System.out.println(min1);
 * System.out.println(min2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 2
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class MinDiapason {

    /**
     * Находит минимальное значение в массиве в пределах указанного диапазона
     * индексов (включительно).
     *
     * <p>Метод выбирает подмассив с индексами от {@code start} до {@code finish}
     * и возвращает минимальное значение среди этих элементов.</p>
     *
     * @param array массив целых чисел, в котором выполняется поиск
     * @param start начальный индекс диапазона (включительно)
     * @param finish конечный индекс диапазона (включительно)
     * @return минимальное значение в указанном диапазоне индексов
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
