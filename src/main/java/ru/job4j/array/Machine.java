package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс {@code Machine} предназначен для расчета сдачи в вендинговом автомате.
 * <p>
 * Используется жадный алгоритм: автомат отдает сдачу монетами наибольшего номинала в первую очередь.
 * Доступные номиналы монет: 10, 5, 2, 1.
 * </p>
 *
 * <p>Примеры работы:</p>
 * <pre>
 *     change(50, 21)  -> {10, 10, 5, 2, 2}
 *     change(100, 63) -> {10, 10, 10, 5, 2}
 *     change(30, 30)  -> {}
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @since 2025-03-04
 */
public class Machine {

    /**
     * Метод {@code change(int money, int price)} рассчитывает сдачу для клиента, используя жадный алгоритм.
     * <p>
     * Если сумма внесенных денег меньше стоимости товара, метод вернет пустой массив.
     * </p>
     *
     * @param money Сумма, внесенная клиентом.
     * @param price Стоимость товара.
     * @return Массив монет, необходимых для сдачи (если сдача не требуется, возвращает пустой массив).
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                result[size++] = coin;
                money -= coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}