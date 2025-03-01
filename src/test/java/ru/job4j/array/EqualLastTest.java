package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс для проверки метода check в классе EqualLast.
 */
public class EqualLastTest {
    @Test
    public void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenLeftIsEmpty() {
        int[] left = {};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenRightIsEmpty() {
        int[] left = {1, 2, 3};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenBothEmpty() {
        int[] left = {};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}