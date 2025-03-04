package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс для вычисления сдачи в вендинговом автомате.
 * Использует жадный алгоритм для возврата монет.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Machine {

    /**
     * Метод для вычисления сдачи, которая должна быть возвращена клиенту.
     * Использует жадный алгоритм для возврата монет от большего к меньшему номиналу.
     *
     * @param money Сумма, которую клиент внес в автомат.
     * @param price Стоимость товара.
     * @return Массив монет, которые необходимо вернуть.
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