package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SortSelectedTest} проверяет корректность работы метода
 * {@link SortSelected#sort(int[])} в классе {@link SortSelected}.
 *
 * <p>Проверяется сортировка массива методом выбора для различных наборов
 * входных данных.</p>
 *
 * <p>Ожидаемый результат — массив должен быть отсортирован в порядке
 * возрастания.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int[] data = new int[] {3, 4, 1, 2, 5};
 * int[] result = SortSelected.sort(data);
 * int[] expected = new int[] {1, 2, 3, 4, 5};
 * assertThat(result).containsExactly(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class SortSelectedTest {

    /**
     * Проверяет {@link SortSelected#sort(int[])} на массиве из пяти элементов.
     * Ожидаемый результат: массив сортируется по возрастанию.
     */
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SortSelected#sort(int[])} на массиве из трех элементов.
     * Ожидаемый результат: массив сортируется по возрастанию.
     */
    @Test
    public void whenSortThreeElements() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SortSelected#sort(int[])} на массиве из пяти элементов,
     * расположенных в произвольном порядке.
     * Ожидаемый результат: массив сортируется по возрастанию.
     */
    @Test
    public void whenSortFiveElements() {
        int[] data = new int[] {5, 3, 4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}
