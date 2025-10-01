package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code MachineTest} содержит модульные тесты для метода
 * {@link Machine#change(int, int)} из класса {@link Machine}.
 *
 * <p>Метод {@link Machine#change(int, int)} рассчитывает сдачу
 * с использованием {@code жадного алгоритма}.</p>
 *
 * <p>Доступные номиналы монет: {@code 10, 5, 2, 1}.</p>
 *
 * <p><b>Примеры работы метода:</b></p>
 * <pre>
 *     Machine.change(50, 21) -> {10, 10, 5, 2, 2}
 *     Machine.change(30, 30) -> {}
 * </pre>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int money = 100;
 * int price = 100;
 * int[] result = Machine.change(money, price);
 * int[] expected = {};
 * assertThat(result).containsExactly(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class MachineTest {

    /**
     * Проверяет случай, когда сумма внесенных денег равна стоимости товара.
     *
     * <p>Ожидается пустой массив (сдачи нет).</p>
     */
    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет случай, когда сдача составляет 15 (10 + 5).
     */
    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет случай, когда сдача составляет 29 (10 + 10 + 5 + 2 + 2).
     */
    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет случай, когда сдача составляет 18 (10 + 5 + 2 + 1).
     */
    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
