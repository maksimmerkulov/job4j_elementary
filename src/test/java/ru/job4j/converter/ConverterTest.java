package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code ConverterTest} содержит тесты для проверки методов конвертации валют в классе {@link Converter}.
 *
 * <p>В тестах проверяется корректность выполнения конвертации:</p>
 * <ul>
 *     <li>Из рублей в евро {@link Converter#rubleToEuro(float)}</li>
 *     <li>Из рублей в доллары {@link Converter#rubleToDollar(float)}</li>
 * </ul>
 *
 * <p>Результаты тестов сравниваются с допустимой погрешностью 0.0001.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-13
 */
class ConverterTest {

    /**
     * Тестирует метод {@link Converter#rubleToEuro(float)} для конвертации 140 рублей в евро.
     * Ожидаемый результат: 1.4271 евро.
     * Точность сравнения с результатом: 0.0001.
     */
    @Test
    void whenConvert140RblThen1dot4271Euro() {
        float input = 140;
        float expected = 1.4271f;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    /**
     * Тестирует метод {@link Converter#rubleToDollar(float)} для конвертации 180 рублей в доллары.
     * Ожидаемый результат: 1.9148 доллара.
     * Точность сравнения с результатом: 0.0001.
     */
    @Test
    void whenConvert180RblThen1dot9148Dollar() {
        float input = 180;
        float expected = 1.9148f;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}