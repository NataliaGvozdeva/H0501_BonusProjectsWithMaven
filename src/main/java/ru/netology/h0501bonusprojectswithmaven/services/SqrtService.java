package ru.netology.h0501bonusprojectswithmaven.services;

public class SqrtService {

    public int calcSqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                //System.out.println("Квадратный корень" + x + "равен" + i);
                return i;
            }
        }
        return -1;
    }
}
