package com.gallifreyantimelord.scaler.dsaadvanced.day36;

/* Find a pair of elements in the given array that will give the maximum result of binary operator AND.
* */

public class MaxAndPair {
    public static void main(String[] args) {
        int[] ar = {26, 13, 23, 28, 27, 7, 25};
        int N = ar.length;
        int ans=0;

        // Step 1: Get the count of bits at every bit position
        for(int i=31; i>=0; i--){
            int c = 0;
            for(int j=0; j<N; j++){
                if(checkBit(ar[j],i)){
                    c+=1;
                }
            }

        // for the same position in the scope, check if the count > 2. This is needed because, if the count is 1, we cannot form a pair.
            if(c>=2){
                ans+=(1<<i);

                // Make the elements whose specific bits are not set.
                for(int k=0; k<N; k++){
                    if(!checkBit(ar[k],i)){
                        ar[k] = 0;
                    }
                }
            }
        }

        System.out.println("The Maximum result is : "+ans);
        System.out.println("The 2 numbers contributing to result are : ");
        for(int i=0; i<N; i++){
            if(ar[i] != 0){
                System.out.print(ar[i]+" ");
            }
        }
    }
    private static boolean checkBit(int A, int b){
        if((A&(1<<b))!=0)
            return true;
        else
            return false;
    }
}
