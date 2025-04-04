package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code MainTest} предназначен для проверки работы основного функционала приложения.
 *
 * <p>Пример простого теста:</p>
 * <pre>
 *     int expected = 1;
 *     int result = 1;
 *     assertThat(result).isEqualTo(expected);
 * </pre>
 *
 * <p>Данный тест служит примером базовой проверки ожидаемого результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-02-13
 */
public class MainTest {

    /**
     * Тест проверяет базовую операцию сравнения двух одинаковых значений.
     */
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result).isEqualTo(excepted);
    }
}
