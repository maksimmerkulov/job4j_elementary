package ru.job4j.array;

/**
 * Класс {@code EndsWith} предназначен для проверки, заканчивается ли массив символов на заданный постфикс.
 *
 * <p>Метод {@link #endsWith(char[], char[])} выполняет посимвольное сравнение конца массива {@code word}
 * с массивом {@code postfix}.</p>
 *
 * <p>Примеры использования:</p>
 * <pre>
 *     char[] word = {'H', 'e', 'l', 'l', 'o'};
 *     char[] postfix = {'l', 'o'};
 *     boolean result = EndsWith.endsWith(word, postfix); true
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-27
 */
public class EndsWith {

    /**
     * Метод {@code endsWith(char[] word, char[] postfix)} проверяет,
     * заканчивается ли массив символов {@code word} на постфикс {@code postfix}.
     *
     * <p>Если длина {@code postfix} больше, чем длина {@code word}, метод всегда возвращает {@code false}.</p>
     *
     * @param word    Массив символов, в котором выполняется проверка.
     * @param postfix Массив символов, который должен быть в конце {@code word}.
     * @return {@code true}, если {@code word} заканчивается на {@code postfix}, иначе {@code false}.
     */
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            if (word[word.length - index - 1] != postfix[postfix.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}