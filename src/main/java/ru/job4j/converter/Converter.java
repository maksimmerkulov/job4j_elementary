package ru.job4j.converter;

/**
 * Класс Converter предназначен для выполнения конвертаций рублей в евро и доллары.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Converter {

    /**
     * Метод rubleToEuro конвертирует рубли в евро.
     *
     * @param value Сумма в рублях.
     * @return Сумма в евро.
     */
    public static float rubleToEuro(float value) {
        return value / 98.10f;
    }

    /**
     * Метод rubleToDollar конвертирует рубли в доллары.
     *
     * @param value Сумма в рублях.
     * @return Сумма в долларах.
     */
    public static float rubleToDollar(float value) {
        return value / 94;
    }
}
