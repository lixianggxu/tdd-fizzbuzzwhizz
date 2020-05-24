package com.tdd;

public class CountOff {
    public String Say(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(i);
    }
}
