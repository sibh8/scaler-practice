package com.gallifreyantimelord.scaler.dsaadvanced.day36.uniqueelements;

public class EvryElementRepeatsTwiceExcept2 {

    public static void main(String[] args) {
        int ar[] = {10, 8, 8, 9, 12, 9, 6, 11, 10, 6, 12, 17};
        int N = ar.length;
        int xorAnswer = 0, pos = 0;


        // Step 1: XOR will cancel the duplicates and the result will be XOR of unique elements.
        for(int i=0; i<N; i++){
            xorAnswer^=ar[i];
        }

        // Step 2: Get which bit is set.
        for(int i=31; i>=0; i--){
            if (checkBit(xorAnswer, i))
                pos = i;
        }

        // Step 3: Divide the elements based on the pos bit in element to check whether it is set or unset.

        int set=0, unset=0;
        for(int i=0; i<N; i++){
            if(checkBit(ar[i], pos))
                set^=ar[i];
            else
                unset^=ar[i];
        }

        System.out.println("The two unique elements in array are: "+set+" and "+unset);


    }

    private static boolean checkBit(int A, int b){
        if((A&(1<<b))!=0)
            return true;
        else
            return false;
    }
}
