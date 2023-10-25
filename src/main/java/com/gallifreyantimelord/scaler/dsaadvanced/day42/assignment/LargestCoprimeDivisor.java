package com.gallifreyantimelord.scaler.dsaadvanced.day42.assignment;

import java.util.ArrayList;

public class LargestCoprimeDivisor {

    public static void main(String[] args) {
        int A = 22;
        int B = 38;

        System.out.println(" Largest coprime divisor: "+cpFact(A, B));
    }

    public static int cpFact(int A, int B) {

        ArrayList<Integer> factAr = calculateFactors(A);

        int max = -1;

        for(Integer factor: factAr){
            if(A%factor == 0 && calculateGcd(B, factor) == 1){
                if(max < factor)
                    max = factor;
            }
        }

        return max;
    }

    private static ArrayList<Integer> calculateFactors(int A){
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=1; i<=A/i; i++){
            if(A%i == 0){
                if(i != A){
                    ar.add(A);
                    ar.add(i);
                }else{
                    ar.add(i);
                }
            }
        }

        return ar;
    }

    private static int calculateGcd(int a, int b){
        if(b == 0)
            return a;

        return calculateGcd(b, a%b);
    }
}
