package ru.job4j.loop;

/**
 * Класс {@code CheckPrimeNumber} предназначен для проверки, является ли
 * заданное число простым.
 *
 * <p>Простое число — это натуральное число, которое больше 1 и делится
 * только на 1 и само себя.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * boolean isPrime = CheckPrimeNumber.check(7);
 * }</pre>
 *
 * <p><b>Результат проверки:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class CheckPrimeNumber {

    /**
     *  Проверяет, является ли переданное число простым.
     *
     * <p>Число считается простым, если оно больше 1 и не делится нацело
     * ни на одно число, кроме 1 и самого себя.</p>
     *
     * @param number число для проверки
     * @return {@code true}, если число простое, иначе {@code false}
     */
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
