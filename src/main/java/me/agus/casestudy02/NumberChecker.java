package me.agus.casestudy02;

public class NumberChecker {

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
