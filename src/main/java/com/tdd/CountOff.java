package com.tdd;

public class CountOff {
    public String Say(int i) {
        if (isDivided(i, 3)) {
            return "Fizz";
        }
        if (isDivided(i, 5)) {
            return "Buzz";
        }
        if (isDivided(i, 7)) {
            return "Whizz";
        }

        return String.valueOf(i);
    }

    private boolean isDivided(int studentNo, int multiple) {
        return studentNo % multiple == 0;
    }
}
