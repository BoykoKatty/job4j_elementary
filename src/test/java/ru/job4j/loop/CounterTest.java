package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyOneThenNinety() {
        int start = 10;
        int finish = 21;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromEightToTwentyThreeThenOneHubdredTwenty() {
        int start = 8;
        int finish = 23;
        int result = Counter.sumByEven(start, finish);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }
}