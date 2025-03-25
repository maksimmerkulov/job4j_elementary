package ru.job4j.array;

/**
 * Класс SimpleStringEncoder реализует алгоритм сжатия строки
 * на основе счётчика повторяющихся символов.
 *
 * - Если символ встречается несколько раз подряд, он заменяется на символ + количество повторений.
 * - Если символ встречается один раз, он остаётся без изменений.
 * - Строка состоит только из строчных букв и не бывает пустой.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SimpleStringEncoder {

    /**
     * Метод encode сжимает строку, заменяя повторяющиеся символы на символ + число повторений.
     *
     * @param input Входная строка, содержащая только строчные буквы (a-z).
     * @return Сжатая строка, где группы одинаковых символов заменены на символ и число повторений.
     *         Если символ встречается один раз, он остаётся без числа.
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