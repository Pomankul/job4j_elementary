package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFiveToFifteenThenFifty() {
        int start = 5;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }
}