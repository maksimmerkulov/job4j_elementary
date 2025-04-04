package ru.job4j.array;

/**
 * Класс {@code SimpleStringEncoder} реализует алгоритм сжатия строки
 * на основе счетчика повторяющихся символов.
 *
 * <p>Принципы работы алгоритма:</p>
 * <ul>
 *     <li>Если символ встречается несколько раз подряд, он заменяется на символ + количество повторений.</li>
 *     <li>Если символ встречается один раз, он остается без изменений.</li>
 *     <li>Строка состоит только из строчных букв и не бывает пустой.</li>
 * </ul>
 *
 * <p>Используется для сокращения длины строки без потери информации о ее содержимом.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-09
 */
public class SimpleStringEncoder {

    /**
     * Метод {@code encode(String input)} сжимает строку, заменяя повторяющиеся символы на символ + число повторений.
     *
     * <p>Исходная строка должна содержать только строчные буквы (a-z).</p>
     *
     * @param input Входная строка, содержащая только строчные буквы (a-z).
     * @return Сжатая строка, где группы одинаковых символов заменены на символ и число повторений.
     *         Если символ встречается один раз, он остается без числа.
     *
     * <p>Пример использования:</p>
     * <pre>
     * String encoded = SimpleStringEncoder.encode("aabbcddd");
     * encoded теперь содержит "a2b2cd3"
     * </pre>
     */
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}