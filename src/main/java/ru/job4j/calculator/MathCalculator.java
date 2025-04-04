package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Класс {@code MathCalculator} предназначен для выполнения математических вычислений,
 * используя методы из класса {@link ru.job4j.math.MathFunction}.
 *
 * <p>
 * Этот класс выполняет операции сложения, вычитания, умножения и деления для двух или более чисел.
 * Также реализованы методы, которые комбинируют эти операции.
 * </p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     double result1 = MathCalculator.sumAndMultiply(10, 20);
 *     double result2 = MathCalculator.subtractAndDivide(100, 20);
 *     double totalResult = MathCalculator.calculateTotal(10, 20, 100, 20);
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-13
 */
public class MathCalculator {

    /**
     * Метод {@code sumAndMultiply(double first, double second)} вычисляет сумму сложения и произведения двух чисел.
     *
     * <p>
     * Выполняет два действия: сначала суммирует числа, затем умножает их и возвращает сумму результатов.
     * </p>
     *
     * @param first  Первое число для сложения и умножения.
     * @param second Второе число для сложения и умножения.
     * @return Сумма результата сложения и произведения двух чисел.
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    /**
     * Метод {@code subtractAndDivide(double first, double second)} вычисляет сумму разности и деления двух чисел.
     *
     * <p>
     * Выполняет два действия: сначала вычитает второе число из первого, затем делит первое число на второе.
     * Возвращает сумму этих двух результатов.
     * </p>
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма разности и деления (если second ≠ 0).
     */
    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    /**
     * Метод {@code calculateTotal(double first, double second, double third, double fourth)} вычисляет сумму всех
     * операций: сложения, умножения, вычитания и деления.
     *
     * <p>
     * Выполняет следующие операции:
     * <ul>
     *     <li>Суммирует первые два числа</li>
     *     <li>Умножает первые два числа</li>
     *     <li>Вычитает третье число из четвертого</li>
     *     <li>Делит третье число на четвертое</li>
     * </ul>
     * Возвращает общую сумму всех операций.
     * </p>
     *
     * @param first  Первое число (для сложения и умножения).
     * @param second Второе число (для сложения и умножения).
     * @param third  Третье число (для вычитания и деления).
     * @param fourth Четвертое число (для вычитания и деления).
     * @return Общая сумма всех операций.
     */
    public static double calculateTotal(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(third, fourth);
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу всех методов класса.
     *
     * <p>Пример вывода:</p>
     * <pre>
     *     Результат расчета суммы сложения и произведения двух чисел равен: 610.0
     *     Результат расчета суммы разности и деления двух чисел равен: 85.0
     *     Результат расчета суммы всех операций равен: 695.0
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        double result1 = sumAndMultiply(10, 20);
        System.out.println("Результат расчета суммы сложения и произведения двух чисел равен: "
                + result1);
        double result2 = subtractAndDivide(100, 20);
        System.out.println("Результат расчета суммы разности и деления двух чисел равен: "
                + result2);
        double totalResult = calculateTotal(10, 20, 100, 20);
        System.out.println("Результат расчета суммы всех операций равен: "
                + totalResult);
    }
}
