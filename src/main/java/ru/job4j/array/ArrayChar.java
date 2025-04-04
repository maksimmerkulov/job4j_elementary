package ru.job4j.array;

/**
 * Класс {@code ArrayChar} предназначен для проверки, начинается ли массив символов с заданного префикса.
 *
 * <p>Метод {@link #startsWith(char[], char[])} выполняет посимвольное сравнение начала массива {@code word}
 * с массивом {@code prefix}. Если все символы префикса совпадают с началом массива, метод возвращает {@code true},
 * иначе — {@code false}.</p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     char[] word = {'h', 'e', 'l', 'l', 'o'};
 *     char[] prefix = {'h', 'e'};
 *     boolean result = ArrayChar.startsWith(word, prefix); true
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class ArrayChar {

    /**
     * Метод {@code startsWith(char[] word, char[] prefix)} проверяет,
     * начинается ли массив символов word с префикса prefix.
     *
     * @param word   Массив символов, в котором выполняется проверка.
     * @param prefix Массив символов, который должен быть в начале word.
     * @return Значение true, если word начинается с prefix, иначе false.
     */
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}