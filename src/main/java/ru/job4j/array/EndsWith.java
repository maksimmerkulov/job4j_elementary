package ru.job4j.array;

/**
 * Класс предназначен для проверки, заканчивается ли массив символов на заданный постфикс.
 */
public class EndsWith {

    /**
     * Метод проверяет, заканчивается ли массив символов word на постфикс postfix.
     *
     * @param word Массив символов, в котором выполняется проверка.
     * @param postfix Массив символов, который должен быть в конце word.
     * @return Значение true, если word заканчивается на postfix, иначе false.
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