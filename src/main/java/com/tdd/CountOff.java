package com.tdd;

public class CountOff {
    public String Say(int studentNo) {
        String sayString = "";
        if (isDivided(studentNo, 3)) {
            sayString += "Fizz";
        }
        if (isDivided(studentNo, 5)) {
            sayString += "Buzz";
        }
        if (isDivided(studentNo, 7)) {
            sayString += "Whizz";
        }

        if (!sayString.equals("")) {
            return sayString;
        } else {
            return String.valueOf(studentNo);
        }
    }

    private boolean isDivided(int studentNo, int multiple) {
        return studentNo % multiple == 0;
    }
}
