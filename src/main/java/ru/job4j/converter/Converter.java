package ru.job4j.converter;

/**
 * Класс {@code Converter} предоставляет методы для конвертации валют.
 * В частности, выполняет конвертацию из рублей в евро и доллары.
 * <p>
 * Конвертация осуществляется по фиксированным курсам:
 * 1 евро = 98.10 рублей и 1 доллар = 94 рубля.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-13
 */
public class Converter {

    /**
     * Метод {@code rubleToEuro(float value)} выполняет конвертацию рублей в евро.
     *
     * @param value Сумма в рублях, которую необходимо конвертировать.
     * @return Сумма в евро.
     */
    public static float rubleToEuro(float value) {
        return value / 98.10f;
    }

    /**
     * Метод {@code rubleToDollar(float value)} выполняет конвертацию рублей в доллары.
     *
     * @param value Сумма в рублях, которую необходимо конвертировать.
     * @return Сумма в долларах.
     */
    public static float rubleToDollar(float value) {
        return value / 94;
    }
}
