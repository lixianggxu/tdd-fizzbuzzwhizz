package com.tdd;

public class CountOff {
    public String Say(int studentNo) {
        if (isDivided(studentNo, 3)) {
            return "Fizz";
        }
        if (isDivided(studentNo, 5)) {
            return "Buzz";
        }
        if (isDivided(studentNo, 7)) {
            return "Whizz";
        }

        return String.valueOf(studentNo);
    }

    private boolean isDivided(int studentNo, int multiple) {
        return studentNo % multiple == 0;
    }
}
