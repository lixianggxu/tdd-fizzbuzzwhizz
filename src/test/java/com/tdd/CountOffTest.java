package com.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOffTest {
    @Test
    public void should_say_Fizz_when_count_off_given_student_NO_is_3() {
        CountOff countoff3 = new CountOff();
        assertThat("Fizz").isEqualTo(countoff3.Say(3));
    }

    @Test
    public void should_say_Buzz_when_count_off_given_student_NO_is_5() {
        CountOff countoff = new CountOff();
        assertThat("Buzz").isEqualTo(countoff.Say(5));
    }
}
