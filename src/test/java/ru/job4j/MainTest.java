package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code MainTest} предназначен для проверки работы основного функционала
 * приложения.
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int expected = 1;
 * int result = 1;
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class MainTest {

    /**
     * Проверяет базовую операцию сравнения двух одинаковых значений.
     */
    @Test
    public void whenActionThenResult() {
        int expected = 1;
        int result = 1;
        assertThat(result).isEqualTo(expected);
    }
}
