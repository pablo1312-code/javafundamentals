package com;

public class AnalisisAlgoritmoExamen7Nov {

	public static int funcionA(int x) {
        if (x < 10) {
            return x + 2;
        }
        return x - 2;
    }

    public static int funcionB(int x) {
    	if (x % 2 == 0) {
            return x * 2;
        }
        return x / 2;
    }

    public static int funcionC(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    public static int funcionD(int x) {
        int result = 0;
        for (int i = x; i > 0; i--) {
            result += funcionA(i);
        }
        return result;
    }

    public static int mainLogic(int n) {
        int val = funcionB(n);
        val = funcionC(val);
        val = funcionD(val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(mainLogic(4));
    }
}


