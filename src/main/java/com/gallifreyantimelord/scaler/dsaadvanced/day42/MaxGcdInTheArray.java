package com.gallifreyantimelord.scaler.dsaadvanced.day42;

/*
Given ar[N] elements, if one element is deleted from the array, find the maximum GCD
Hint: Use the equilibrium index technoique: Prefix and Suffix array.
 */

public class MaxGcdInTheArray {
    public static void main(String[] args) {
        int[] A = {24, 16, 18, 30, 15};
        int N = A.length;
        int[] pgcd = new int[N];
        int[] sgcd = new int[N];

        // Calculate the prefix GCD
        int gcd = A[0];
        pgcd[0] = gcd;
        for(int i=1; i<N; i++){
            gcd = calculateGcd(gcd, A[i]);
            pgcd[i] = gcd;
        }

        // Calculate suffix GCD
        gcd = A[N-1];
        sgcd[N-1] = gcd;
        for(int i=N-2; i>=0; i--){
            gcd = calculateGcd(gcd, A[i]);
            sgcd[i] = gcd;
        }

        // Calculate the maximum GCD using the suffix, prefix array.

        int max = max(sgcd[1], pgcd[N-1]);
        int rgcd = 0;

        for(int i=1; i<N-2; i++){
            rgcd = calculateGcd(pgcd[i-1], sgcd[i+1]);

            max = max(max, rgcd);
        }

        System.out.println("Max GCD after deleting an element is: "+max);
    }

    private static int max(int a, int b) {
        return a>b?a:b;
    }

    private static int calculateGcd(int a, int b){
        if(b==0)
            return a;

        return calculateGcd(b, a%b);
    }
}
