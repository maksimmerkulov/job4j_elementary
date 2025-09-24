package ru.job4j.converter;

/**
 * Класс {@code Converter} предоставляет методы для конвертации валют.
 *
 * <p>Предназначен для перевода рублей в евро и доллары США по фиксированным
 * курсам.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * float euro = Converter.rubleToEuro(196.20F);
 * float dollar = Converter.rubleToDollar(188F);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 196.20 рублей = 2.0 евро
 * 188 рублей = 2.0 доллара
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Converter {

    /**
     * Выполняет конвертацию рублей в евро.
     *
     * @param value сумма в рублях, которую необходимо конвертировать
     * @return сумма в евро
     */
    public static float rubleToEuro(float value) {
        return value / 98.10F;
    }

    /**
     * Выполняет конвертацию рублей в доллары.
     *
     * @param value сумма в рублях, которую необходимо конвертировать
     * @return сумма в долларах
     */
    public static float rubleToDollar(float value) {
        return value / 94;
    }
}
