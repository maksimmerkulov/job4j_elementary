package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code FitnessTest} проверяет работу метода {@link Fitness#calc(int, int)}
 * из класса {@link Fitness}.
 *
 * <p>Метод {@link Fitness#calc(int, int)} вычисляет количество месяцев, за которые Иван сможет превзойти
 * Николая по силе тяги, если каждый месяц его сила увеличивается в 3 раза, а сила Николая — в 2 раза.</p>
 *
 * <p>В тестах проверяются различные сценарии, включая случаи, когда:</p>
 * <ul>
 *     <li>Иван изначально сильнее Николая.</li>
 *     <li>Иван немного слабее Николая.</li>
 *     <li>Иван значительно слабее Николая.</li>
 *     <li>Иван и Николай начинают с одинаковой силой.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
class FitnessTest {

    /**
     * Тест на случай, когда сила Ивана изначально больше силы Николая.
     * Ожидаемый результат: 0 месяцев (Иван уже сильнее).
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
     * Тест на случай, когда сила Ивана меньше силы Николая всего на 5 кг.
     * Ожидаемый результат: 1 месяц.
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
     * Тест на случай, когда сила Ивана значительно меньше силы Николая.
     * Ожидаемый результат: 2 месяца.
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
     * Тест на случай, когда Иван и Николай начинают с одинаковой силой.
     * Ожидаемый результат: 1 месяц.
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
