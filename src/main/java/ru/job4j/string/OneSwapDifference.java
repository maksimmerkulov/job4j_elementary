package ru.job4j.string;

/**
 * Класс {@code OneSwapDifference} проверяет, можно ли получить второе слово из первого,
 * если в первом слове поменять местами ровно два символа.
 *
 * <p>Сравнение происходит по порядку: выполняется поиск позиций, где символы различаются.
 * Если таких позиций ровно две — символы в этих позициях меняются и результат сравнивается повторно.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * boolean result = OneSwapDifference.canTransform("abc", "acb");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OneSwapDifference {

    /**
     * Проверяет, можно ли получить {@code word2}, поменяв в {@code word1} местами ровно два символа.
     *
     * <p>Если строки разной длины — сразу возвращается {@code false}.</p>
     *
     * @param word1 Первое слово.
     * @param word2 Второе слово.
     * @return {@code true}, если достаточно одной перестановки двух символов, иначе {@code false}
     */
    public static boolean canTransform(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int first = -1;
        int second = -1;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }
        if (second == -1) {
            return false;
        }
        return word1.charAt(first) == word2.charAt(second)
                && word1.charAt(second) == word2.charAt(first);
    }
}