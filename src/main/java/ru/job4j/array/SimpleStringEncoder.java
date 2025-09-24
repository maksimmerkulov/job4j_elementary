package ru.job4j.array;

/**
 * Класс {@code SimpleStringEncoder} реализует алгоритм сжатия строки,
 * заменяя повторяющиеся символы на символ с количеством повторов.
 *
 * <p>Принципы работы алгоритма:</p>
 * <ul>
 *     <li>Если символ повторяется подряд, он заменяется на символ + число.</li>
 *     <li>Если символ встречается один раз, он остается без изменений.</li>
 *     <li>Строка состоит только из строчных букв и не бывает пустой.</li>
 * </ul>
 *
 * <p>Используется для сокращения строки без потери информации о содержимом.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String input = "aabcccccaaa";
 * String compressed = SimpleStringEncoder.encode(input);
 * System.out.println(compressed);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * a2bc5a3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SimpleStringEncoder {

    /**
     * Сжимает строку, заменяя группы одинаковых символов на символ с числом.
     *
     * <p>Исходная строка должна содержать только строчные буквы (a-z).</p>
     *
     * @param input входная строка со строчными буквами
     * @return сжатая строка с повторяющимися символами, представленными как
     *         символ + число повторов
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
