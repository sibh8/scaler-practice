package com.gallifreyantimelord.scaler.dsaadvanced.day35;


/*
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 */

public class MagicNumber {

    public static void main(String[] args) {
        int magnum = 6;
        System.out.println("The "+magnum+" th magic number is "+solve(magnum));
    }

    public static int solve(int A) {

        int i = 1, ans = 0;
        while(A != 0){
            if((A & 1) !=0){
                ans+=calculatePowersOf5(i);
            }
            i+=1;
            A = A>>1;
        }
        return ans;
    }

    private static int calculatePowersOf5(int index){

        if(index == 0){
            return 1;
        }

        int ans = calculatePowersOf5(index-1)*5;

        return ans;
    }
}
