package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code MinDiapasonTest} проверяет корректность работы метода
 * {@link MinDiapason#findMin(int[], int, int)} в классе {@link MinDiapason}.
 *
 * <p>Проверяется поиск минимального значения в заданном диапазоне индексов массива.</p>
 *
 * <p>Ожидаемый результат — метод возвращает минимальный элемент среди заданных границ.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class MinDiapasonTest {

    /**
     * Тест для MinDiapason#findMin(int[], int, int)},
     * когда минимальный элемент находится в начале диапазона.
     *
     * <p>Ожидаемый результат: возвращается первый элемент диапазона как минимальный.</p>
     */
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для MinDiapason#findMin(int[], int, int)},
     * когда минимальный элемент находится в конце диапазона.
     *
     * <p>Ожидаемый результат: метод должен вернуть последний элемент диапазона.</p>
     */
    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для {@link MinDiapason#findMin(int[], int, int)},
     * когда минимальный элемент находится в середине диапазона.
     *
     * <p>Ожидаемый результат: метод должен вернуть средний по позиции минимальный элемент.</p>
     */
    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}