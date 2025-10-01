package ru.job4j.loop;

/**
 * Класс {@code Factorial} предназначен для вычисления факториала числа.
 *
 * <p>Факториал числа {@code n} определяется как произведение всех натуральных
 * чисел от 1 до {@code n} включительно.</p>
 *
 * <p><b>Определение:</b></p>
 * <ul>
 *     <li>{@code 0! = 1}</li>
 *     <li>{@code n! = n × (n - 1) × ... × 1}, если {@code n > 0}</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int result1 = Factorial.calculate(5);
 * int result2 = Factorial.calculate(0);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result1 = 120
 * result2 = 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Factorial {

    /**
     * Вычисляет факториал заданного числа.
     *
     * <p>Факториал {@code number} вычисляется как произведение всех целых
     * чисел от 1 до {@code number} включительно.</p>
     *
     * @param number число, факториал которого нужно вычислить
     *               (должно быть неотрицательным)
     * @return факториал числа {@code number}
     */
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
