package ru.job4j.array;

/**
 * Класс {@code SimpleStringEncoder} реализует алгоритм сжатия строки
 * на основе счетчика повторяющихся символов.
 *
 * <p><p>Принципы работы алгоритма:</p></p>
 * <ul>
 *     <li>Если символ встречается несколько раз подряд, он заменяется на символ + количество повторений.</li>
 *     <li>Если символ встречается один раз, он остается без изменений.</li>
 *     <li>Строка состоит только из строчных букв и не бывает пустой.</li>
 * </ul>
 *
 * <p>Используется для сокращения длины строки без потери информации о ее содержимом.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String input = "aabcccccaaa";
 * String compressed = SimpleStringEncoder.encode(input);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * compressed = a2bc5a3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SimpleStringEncoder {

    /**
     * Сжимает строку, заменяя повторяющиеся символы на символ + число повторений.
     *
     * <p>Исходная строка должна содержать только строчные буквы (a-z).</p>
     *
     * @param input Входная строка, содержащая только строчные буквы (a-z).
     * @return Сжатая строка, где группы одинаковых символов заменены на символ и число повторений.
     *         Если символ встречается один раз, он остается без числа.
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