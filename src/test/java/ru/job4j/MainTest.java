package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result).isEqualTo(excepted);
    }
}
