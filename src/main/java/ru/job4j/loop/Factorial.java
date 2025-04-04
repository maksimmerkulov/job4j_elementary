package ru.job4j.loop;

/**
 * Класс {@code Factorial} предназначен для вычисления факториала числа.
 *
 * <p>Факториал числа {@code n} определяется как произведение всех натуральных чисел от 1 до {@code n} включительно.</p>
 * <p>Определение:</p>
 * <ul>
 *     <li>{@code 0! = 1}</li>
 *     <li>{@code n! = n * (n-1) * (n-2) * ... * 1}, если {@code n > 0}</li>
 * </ul>
 *
 * <p>Примеры использования:</p>
 * <pre>
 *     Factorial.calculate(5); 120
 *     Factorial.calculate(0); 1
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
public class Factorial {

    /**
     * Метод {@code calculate(int number)} вычисляет факториал заданного числа.
     *
     * <p>Факториал {@code number} вычисляется как произведение всех целых чисел от 1 до {@code number} включительно.</p>
     *
     * @param number Число, факториал которого нужно вычислить (должно быть неотрицательным).
     * @return Факториал числа {@code number}.
     */
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
