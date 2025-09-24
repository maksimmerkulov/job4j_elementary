package ru.job4j.array;

/**
 * Класс {@code EndsWith} предназначен для проверки, заканчивается ли массив
 * символов на заданный постфикс.
 *
 * <p>Метод {@link #endsWith(char[], char[])} выполняет посимвольное сравнение
 * конца массива {@code word} с массивом {@code postfix}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * char[] word = {'H', 'e', 'l', 'l', 'o'};
 * char[] postfix1 = {'l', 'o'};
 * boolean result1 = EndsWith.endsWith(word, postfix1);
 *
 * char[] postfix2 = {'l', 'a'};
 * boolean result2 = EndsWith.endsWith(word, postfix2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result1 = true
 * result2 = false
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class EndsWith {

    /**
     * Проверяет, заканчивается ли массив символов {@code word} на постфикс
     * {@code postfix}.
     *
     * <p>Если длина {@code postfix} больше, чем длина {@code word}, метод
     * всегда возвращает {@code false}.</p>
     *
     * @param word массив символов, в котором выполняется проверка
     * @param postfix массив символов, который должен быть в конце {@code word}
     * @return {@code true}, если {@code word} заканчивается на {@code postfix},
     *         иначе {@code false}
     */
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            if (word[word.length - index - 1]
                    != postfix[postfix.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
