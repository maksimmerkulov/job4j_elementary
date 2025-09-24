package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс {@code Machine} предназначен для расчета сдачи в вендинговом автомате.
 *
 * <p>Используется {@code жадный алгоритм}: автомат отдает сдачу монетами
 * наибольшего номинала в первую очередь. Доступные номиналы монет:
 * {@code 10, 5, 2, 1}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] change1 = Machine.change(50, 35);
 * int[] change2 = Machine.change(20, 19);
 * int[] change3 = Machine.change(10, 10);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * change1 = [10, 5]
 * change2 = [1]
 * change3 = []
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class Machine {

    /**
     * Рассчитывает сдачу для клиента, используя жадный алгоритм.
     *
     * <p>Если сумма внесенных денег меньше стоимости товара, метод вернет
     * пустой массив.</p>
     *
     * @param money сумма, внесенная клиентом
     * @param price стоимость товара
     * @return массив монет, необходимых для сдачи (если сдача не требуется,
     *         возвращает пустой массив)
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
