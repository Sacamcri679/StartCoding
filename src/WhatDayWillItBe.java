public class WhatDayWillItBe {
    public static void main(String[] args) {
        int tuesday = 2;

        int day = (tuesday + 100) % 7;
        System.out.println(day);

    }
}
