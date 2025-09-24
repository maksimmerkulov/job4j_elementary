package ru.job4j.array;

/**
 * Класс {@code ArrayChar} предназначен для проверки, начинается ли массив
 * символов с заданного префикса.
 *
 * <p>Метод {@link #startsWith(char[], char[])} выполняет посимвольное
 * сравнение начала массива {@code word} с массивом {@code prefix}.
 * Если все символы префикса совпадают с началом массива, метод
 * возвращает {@code true}, иначе — {@code false}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * char[] word = {'J', 'a', 'v', 'a'};
 * char[] prefix = {'J', 'a'};
 * boolean result = ArrayChar.startsWith(word, prefix);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class ArrayChar {

    /**
     * Проверяет, начинается ли массив символов {@code word} с префикса
     * {@code prefix}.
     *
     * @param word массив символов, в котором выполняется проверка
     * @param prefix массив символов, который должен быть в начале {@code word}
     * @return {@code true}, если {@code word} начинается с {@code prefix},
     *         иначе {@code false}
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
