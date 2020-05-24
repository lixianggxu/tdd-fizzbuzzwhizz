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

    @Test
    public void should_say_Whizz_when_count_off_given_student_NO_is_7() {
        CountOff countoff = new CountOff();
        assertThat("Whizz").isEqualTo(countoff.Say(7));
    }

    @Test
    public void should_say_FizzBuzz_when_count_off_given_student_NO_is_15() {
        CountOff countoff = new CountOff();
        assertThat("FizzBuzz").isEqualTo(countoff.Say(15));
    }
}
