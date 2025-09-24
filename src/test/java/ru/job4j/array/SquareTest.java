package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SquareTest} проверяет метод {@link Square#calculate(int)}
 * в классе {@link Square}.
 *
 * <p>Методы тестируют корректность работы алгоритма заполнения массива
 * квадратами чисел.</p>
 *
 * <p>Проверяется, что метод возвращает массив правильной длины и с ожидаемыми
 * значениями.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int bound = 3;
 * int[] result = Square.calculate(bound);
 * int[] expected = new int[] {0, 1, 4};
 * assertThat(result).containsExactly(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class SquareTest {

    /**
     * Проверяет {@link Square#calculate(int)} с bound = 3.
     * Ожидаемый результат: массив {0, 1, 4}.
     */
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link Square#calculate(int)} с bound = 5.
     * Ожидаемый результат: массив {0, 1, 4, 9, 16}.
     */
    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}
