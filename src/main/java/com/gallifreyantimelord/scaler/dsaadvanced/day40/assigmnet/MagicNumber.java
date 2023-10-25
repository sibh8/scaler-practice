package com.gallifreyantimelord.scaler.dsaadvanced.day40.assigmnet;

/*
Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits
after every addition. If the single digit comes out to be 1, then the number is a magic number.
 */

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(checkMagicNumber(1291));
    }

    private static int checkMagicNumber(int A){

        while(A/10 >= 1){
            A = calculateDigitSum(A);
        }

        if (A%10 == 1)
            return 1;
        else
            return 0;
    }

    private static int calculateDigitSum(int A){

        if(A/10 == 0)
            return A%10;

        return calculateDigitSum(A/10)+A%10;
    }
}
