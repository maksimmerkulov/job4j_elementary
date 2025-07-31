package ru.job4j.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for the {@link OneSwapDifference} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class OneSwapDifferenceTest {

    /** Verifies that swapping two characters makes strings equal. */
    @Test
    void whenSwapTwoLettersThenTrue() {
        assertTrue(OneSwapDifference.canTransform("converse", "convesre"));
    }

    /** Verifies that identical strings return false since no swap occurred. */
    @Test
    void whenWordsAreEqualThenFalse() {
        assertFalse(OneSwapDifference.canTransform("same", "same"));
    }

    /** Verifies that more than two differing characters return false. */
    @Test
    void whenMoreThanTwoDifferencesThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abcde", "edcba"));
    }

    /** Verifies that strings with different lengths return false. */
    @Test
    void whenDifferentLengthsThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abc", "ab"));
    }

    /** Verifies that swapping characters at the very edges works correctly. */
    @Test
    void whenSwapNeededAtEdgesThenTrue() {
        assertTrue(OneSwapDifference.canTransform("ab", "ba"));
    }

    /** Verifies that a single character difference returns false. */
    @Test
    void whenOnlyOneDifferenceThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abcd", "abcf"));
    }

    /** Verifies that empty strings return false. */
    @Test
    void whenEmptyStringsThenFalse() {
        assertFalse(OneSwapDifference.canTransform("", ""));
    }
}
