package ru.job4j.array;

/**
 * Класс ArrayChar предназначен для проверки, начинается ли массив символов с заданного префикса.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ArrayChar {

    /**
     * Метод startsWith проверяет, начинается ли массив символов word с префикса prefix.
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