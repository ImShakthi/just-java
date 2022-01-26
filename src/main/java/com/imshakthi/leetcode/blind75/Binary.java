package com.imshakthi.leetcode.blind75;

public class Binary {

    // https://leetcode.com/problems/sum-of-two-integers
    public int sumOfTwoIntegers(int a, int b) {
        while (b != 0) {
            int answer = a ^ b;
            int carry = (a & b) << 1;
            System.out.println(">>>>answer=" + answer);
            System.out.println(">>>>carry=" + carry);
            a = answer;
            b = carry;
        }
        return a;
    }
}
