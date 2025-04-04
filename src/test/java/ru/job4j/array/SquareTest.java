package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code SquareTest} для проверки метода {@link Square#calculate(int)} в классе {@link Square}.
 *
 * <p>Методы тестируют корректность работы алгоритма заполнения массива квадратами чисел.</p>
 * <p>Проверяется, что метод возвращает массив правильной длины и с ожидаемыми значениями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-24
 */
class SquareTest {

    /**
     * Тест для {@code calculate(3)}.
     *
     * <p>Ожидаемый результат: массив {0, 1, 4}.</p>
     */
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест для {@code calculate(5)}.
     *
     * <p>Ожидаемый результат: массив {0, 1, 4, 9, 16}.</p>
     */
    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}