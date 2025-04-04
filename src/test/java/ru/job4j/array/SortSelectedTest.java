package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code SortSelectedTest} проверяет корректность работы метода
 * {@link SortSelected#sort(int[])} в классе {@link SortSelected}.
 *
 * <p>Проверяется сортировка массива методом выбора для различных наборов входных данных.</p>
 *
 * <p>Ожидаемый результат — массив должен быть отсортирован в порядке возрастания.</p>
 *
 * @author Maksим Меркулов
 * @version 1.2
 * @since 2025-02-28
 */
public class SortSelectedTest {

    /**
     * Тест для {@link SortSelected#sort(int[])} с массивом из пяти элементов.
     *
     * <p>Ожидаемый результат: массив сортируется в порядке возрастания.</p>
     */
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест для {@link SortSelected#sort(int[])} с массивом из трех элементов.
     *
     * <p>Ожидаемый результат: массив сортируется в порядке возрастания.</p>
     */
    @Test
    public void whenSortThreeElements() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест для {@link SortSelected#sort(int[])} с массивом из пяти элементов,
     * расположенных в разном порядке.
     *
     * <p>Ожидаемый результат: массив сортируется в порядке возрастания.</p>
     */
    @Test
    public void whenSortFiveElements() {
        int[] data = new int[] {5, 3, 4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}