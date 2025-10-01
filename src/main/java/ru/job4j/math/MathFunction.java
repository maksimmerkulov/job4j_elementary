package ru.job4j.math;

/**
 * Класс {@code MathFunction} предназначен для выполнения основных
 * математических операций: сложения, вычитания, умножения и деления.
 * Все операции выполняются с использованием чисел типа {@code double}.
 *
 * <p>Класс состоит исключительно из статических методов и не предназначен
 * для создания экземпляров.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * double result1 = MathFunction.sum(3.5, 2.5);
 * double result2 = MathFunction.subtract(5, 3);
 * double result3 = MathFunction.multiply(4, 2.5);
 * double result4 = MathFunction.divide(10, 2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 6.0
 * 2.0
 * 10.0
 * 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MathFunction {

    /**
     * Выполняет сложение двух чисел.
     *
     * @param first первое число для сложения
     * @param second второе число для сложения
     * @return сумма двух чисел
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Выполняет вычитание двух чисел.
     *
     * @param first уменьшаемое число
     * @param second вычитаемое число
     * @return разность чисел
     */
    public static double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Выполняет умножение двух чисел.
     *
     * @param first первый множитель
     * @param second второй множитель
     * @return произведение двух чисел
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Выполняет деление двух чисел.
     *
     * @param first делимое число
     * @param second делитель
     * @return результат деления
     * @throws IllegalArgumentException если второе число (делитель) равно нулю
     */
    public static double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException(
                    "Ошибка: деление на ноль невозможно!"
            );
        }
        return first / second;
    }
}
