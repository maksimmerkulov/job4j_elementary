package ru.job4j.converter;

/**
 * Класс Converter выполняет конвертацию рублей в евро и доллары.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Converter {

    /**
     * Метод конвертирует рубли в евро.
     *
     * @param value Сумма в рублях.
     * @return Сумма в евро.
     */
    public static float rubleToEuro(float value) {
        return value / 98.10f;
    }

    /**
     * Метод конвертирует рубли в доллары.
     *
     * @param value Сумма в рублях.
     * @return Сумма в долларах.
     */
    public static float rubleToDollar(float value) {
        return value / 94;
    }
}
