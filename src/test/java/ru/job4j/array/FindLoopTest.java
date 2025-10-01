package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code FindLoopTest} для проверки методов поиска индекса в массиве в
 * классе {@link FindLoop}.
 *
 * <p><b>Проверяется корректная работа методов:</b></p>
 * <ul>
 *     <li>{@link FindLoop#indexOf(int[], int)} — поиск во всем массиве</li>
 *     <li>{@link FindLoop#indexInRange(int[], int, int, int)} — поиск в
 *         диапазоне</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * int[] data = new int[] {5, 10, 3};
 * int element = 5;
 * int result = FindLoop.indexOf(data, element);
 * int expected = 0;
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FindLoopTest {

    /**
     * Проверяет, что метод {@link FindLoop#indexOf(int[], int)} корректно
     * находит индекс элемента 5 в массиве {5, 10, 3}.
     *
     * <p>Ожидаемый результат: 0.</p>
     */
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexOf(int[], int)} возвращает -1,
     * если элемент 10 отсутствует в массиве {2, 11, 4, 9, 7}.
     *
     * <p>Ожидаемый результат: -1.</p>
     */
    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {2, 11, 4, 9, 7};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * находит 8 в диапазоне [2,5] массива {5, 2, 10, 2, 4, 8, 14, 3, 21, 16}.
     *
     * <p>Ожидаемый результат: 5.</p>
     */
    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * находит первое вхождение 4 в диапазоне [1,8] массива.
     *
     * <p>Ожидаемый результат: 3.</p>
     */
    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * находит 2 в диапазоне [2,4] массива {5, 2, 10, 2, 4}.
     *
     * <p>Ожидаемый результат: 3.</p>
     */
    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * возвращает -1, если 8 отсутствует в диапазоне [2,5] массива
     * {5, 3, 10, 2, 4, 6, 8, 3, 21, 16}.
     *
     * <p>Ожидаемый результат: -1.</p>
     */
    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {5, 3, 10, 2, 4, 6, 8, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * находит 8 в диапазоне [2,6] массива {5, 2, 10, 2, 4, 8, 14, 3, 21, 16}.
     *
     * <p>Ожидаемый результат: 5.</p>
     */
    @Test
    public void whenDiapasonHas8Then5() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет, что метод {@link FindLoop#indexInRange(int[], int, int, int)}
     * возвращает -1, если 6 отсутствует в диапазоне [1,4] массива
     * {5, 2, 10, 2, 4, 6, 14, 3, 21, 16}.
     *
     * <p>Ожидаемый результат: -1.</p>
     */
    @Test
    public void whenDiapasonHasNot6ThenMinus1() {
        int[] data = {5, 2, 10, 2, 4, 6, 14, 3, 21, 16};
        int element = 6;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
