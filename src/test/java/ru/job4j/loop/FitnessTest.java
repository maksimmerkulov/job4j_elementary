package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code FitnessTest} проверяет метод {@link Fitness#calc(int, int)}
 * класса {@link Fitness}.
 *
 * <p>Метод {@link Fitness#calc(int, int)} вычисляет количество месяцев, за
 * которые Иван сможет превзойти Николая по силе тяги, если каждый месяц сила
 * Ивана увеличивается в 3 раза, а сила Николая — в 2 раза.</p>
 *
 * <p>Тесты проверяют разные сценарии:</p>
 * <ul>
 *     <li>Иван изначально сильнее Николая</li>
 *     <li>Иван немного слабее Николая</li>
 *     <li>Иван значительно слабее Николая</li>
 *     <li>Иван и Николай начинают с одинаковой силой</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * int ivan = 95;
 * int nik = 90;
 * int expected = 0;
 * int result = Fitness.calc(ivan, nik);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FitnessTest {

    /**
     * Проверяет {@link Fitness#calc(int, int)}, когда Иван изначально сильнее.
     * Ожидаемый результат: 0 месяцев.
     */
    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Fitness#calc(int, int)}, когда сила Ивана меньше
     * силы Николая на 5 кг. Ожидаемый результат: 1 месяц.
     */
    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Fitness#calc(int, int)}, когда сила Ивана значительно
     * меньше силы Николая. Ожидаемый результат: 2 месяца.
     */
    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Fitness#calc(int, int)}, когда Иван и Николай начинают
     * с одинаковой силой. Ожидаемый результат: 1 месяц.
     */
    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }
}
