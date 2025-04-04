package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code CheckTest} для проверки метода {@link Check#mono(boolean[])} класса {@link Check}.
 *
 * <p>Методы тестируют корректность определения однородности массива.</p>
 * <p>Проверяются случаи, когда массив полностью состоит из {@code true} или {@code false},
 * а также случаи, когда массив содержит разные значения.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-27
 */
class CheckTest {

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает {@code true},
     * если массив полностью состоит из {@code true}.
     */
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает {@code false},
     * если массив содержит разные значения, начиная с {@code true}.
     */
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает {@code true},
     * если массив полностью состоит из {@code false}.
     */
    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает {@code false},
     * если массив содержит разные значения, начиная с {@code false}.
     */
    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}