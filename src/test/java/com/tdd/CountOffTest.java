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

    @Test
    public void should_say_BuzzWhizz_when_count_off_given_student_NO_is_35() {
        CountOff countoff = new CountOff();
        assertThat("BuzzWhizz").isEqualTo(countoff.Say(35));
    }

    @Test
    public void should_say_FizzWhizz_when_count_off_given_student_NO_is_21() {
        CountOff countoff = new CountOff();
        assertThat("FizzWhizz").isEqualTo(countoff.Say(21));
    }

    @Test
    public void should_say_FizzBuzzWhizz_when_count_off_given_student_NO_is_105() {
        CountOff countoff = new CountOff();
        assertThat("FizzBuzzWhizz").isEqualTo(countoff.Say(105));
    }

    @Test
    public void should_say_1_when_count_off_given_student_NO_is_1() {
        CountOff countoff = new CountOff();
        assertThat("1").isEqualTo(countoff.Say(1));
    }
}
