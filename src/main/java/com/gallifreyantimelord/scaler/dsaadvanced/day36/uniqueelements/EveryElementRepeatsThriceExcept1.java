package com.gallifreyantimelord.scaler.dsaadvanced.day36.uniqueelements;

public class EveryElementRepeatsThriceExcept1 {

    public static void main(String[] args) {
        int[] ar = {6, 5, 6, 4, 5, 6, 5};
        int N = ar.length;
        int ans = 0;

        for(int i=31; i>=0; i--){
            int c = 0;
            for(int j = 0; j<N; j++){
                if(checkbit(ar[j], i))
                    c+=1;
            }

            if(c%3 == 1)
                ans+=(1<<i);
        }
        System.out.println("Required Number: "+ans);
    }

    private static boolean checkbit(int A, int b){
        if((A & (1<<b)) !=0)
            return true;
        else
            return false;
    }
}
