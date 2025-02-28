package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FitnessTest {
    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }
}
