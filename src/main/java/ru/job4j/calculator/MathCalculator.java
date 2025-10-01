package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Класс {@code MathCalculator} выполняет математические вычисления, используя
 * методы из класса {@link ru.job4j.math.MathFunction}.
 *
 * <p>Реализует операции сложения, вычитания, умножения и деления для двух или
 * более чисел, а также комбинированные методы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * double result1 = MathCalculator.sumAndMultiply(10, 20);
 * double result2 = MathCalculator.subtractAndDivide(100, 20);
 * double result3 = MathCalculator.calculateTotal(10, 20, 100, 20);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Результат расчета суммы сложения и произведения двух чисел равен: 230.0
 * Результат расчета суммы разности и деления двух чисел равен: 85.0
 * Результат расчета суммы всех операций равен: 315.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MathCalculator {

    /**
     * Вычисляет сумму сложения и произведения двух чисел.
     *
     * @param first первое число
     * @param second второе число
     * @return сумма сложения и произведения
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    /**
     * Вычисляет сумму разности и деления двух чисел.
     *
     * @param first первое число
     * @param second второе число
     * @return сумма разности и деления
     */
    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    /**
     * Вычисляет сумму всех операций: сложения, умножения, вычитания и деления.
     *
     * @param first первое число (для сложения и умножения)
     * @param second второе число (для сложения и умножения)
     * @param third третье число (для вычитания и деления)
     * @param fourth четвертое число (для вычитания и деления)
     * @return общая сумма всех операций
     */
    public static double calculateTotal(double first, double second,
                                        double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(third, fourth);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу всех методов класса.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        double result1 = sumAndMultiply(10, 20);
        System.out.println(
                "Результат расчета суммы сложения и произведения двух чисел "
                        + "равен: " + result1
        );
        double result2 = subtractAndDivide(100, 20);
        System.out.println(
                "Результат расчета суммы разности и деления двух чисел равен: "
                        + result2
        );
        double totalResult = calculateTotal(10, 20, 100, 20);
        System.out.println("Результат расчета суммы всех операций равен: "
                + totalResult);
    }
}
