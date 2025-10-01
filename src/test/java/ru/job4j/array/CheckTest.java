package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code CheckTest} для проверки метода {@link Check#mono(boolean[])}
 * класса {@link Check}.
 *
 * <p>Проверяются случаи, когда массив полностью состоит из {@code true} или
 * {@code false}, а также случаи, когда массив содержит разные значения.</p>
 *
 * <p><b>Примеры тестируемых случаев:</b></p>
 * <ul>
 *     <li>{@code [true, true, true]} → {@code true}</li>
 *     <li>{@code [true, false, true]} → {@code false}</li>
 *     <li>{@code [false, false, false]} → {@code true}</li>
 *     <li>{@code [false, true, false]} → {@code false}</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * boolean[] data = new boolean[] {true, true, true};
 * boolean result = Check.mono(data);
 * assertThat(result).isTrue();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class CheckTest {

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает
     * {@code true}, если массив полностью состоит из {@code true}.
     */
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает
     * {@code false}, если массив содержит разные значения, начиная с
     * {@code true}.
     */
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает
     * {@code true}, если массив полностью состоит из {@code false}.
     */
    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, что метод {@link Check#mono(boolean[])} возвращает
     * {@code false}, если массив содержит разные значения, начиная с
     * {@code false}.
     */
    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}
