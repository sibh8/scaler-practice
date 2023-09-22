package com.gallifreyantimelord.scaler.dsaadvanced.day36.uniqueelements;

public class AllElementsRepeatsTwiceExcept1 {

    public static void main(String[] args) {
        int[] ar = {3, 2, 3, 7, 2, 8, 7};
        int N = ar.length;

        int ans = ar[0];

        for(int i=1; i<N; i++){
            ans = ans ^ ar[i];
        }

        System.out.println("Unique Element: "+ans);
    }
}
