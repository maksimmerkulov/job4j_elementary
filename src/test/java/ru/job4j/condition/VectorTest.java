package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code VectorTest} предназначен для проверки метода
 * {@link Vector#addVectors(int, int, int, int)} из класса {@link Vector}.
 *
 * <p>
 * Проверяются различные случаи сложения векторов, включая положительные,
 * отрицательные и смешанные координаты.
 * </p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     String result = Vector.addVectors(1, 2, 3, 4);
 *     assertThat(result).isEqualTo("(4, 6)");
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-14
 */
class VectorTest {

    /**
     * Тест проверяет сложение векторов (1, 2) и (3, 4).
     * <p>Ожидаемый результат: (4, 6).</p>
     */
    @Test
    void whenVectors12And34ThenResult4And6() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Тест проверяет сложение векторов (-1, -2) и (3, 4).
     * <p>Ожидаемый результат: (2, 2).</p>
     */
    @Test
    void whenVectorsMinus12And34ThenResult2And2() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expected = "(2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Тест проверяет сложение векторов (-1, -2) и (-3, -4).
     * <p>Ожидаемый результат: (-4, -6).</p>
     */
    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus4AndMinus6() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
