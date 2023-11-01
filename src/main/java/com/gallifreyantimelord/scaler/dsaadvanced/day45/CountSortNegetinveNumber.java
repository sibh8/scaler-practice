package com.gallifreyantimelord.scaler.dsaadvanced.day45;

public class CountSortNegetinveNumber {

    public static void main(String[] args) {
        int[] A = {-2, 3, 8, -5, 3, -2, 3};
        int N = A.length;

        // Find the maximum
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
        }

        // Find the minimum
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] < min){
                min = A[i];
            }
        }

        // Create a frequency array with size max-min
        int FN = max-min;
        int[] F = new int[FN];

        // Insert the numbers into the frequency array
        for(int i=0; i<FN; i++){
            F[A[i]-min]+=1;
        }

        // Sort the numbers as per their order
        int k = 0;
        for(int i=0; i<FN; i++){
            for(int j=i; j<F[i]; j++){
                A[k] = min+i;
            }
        }

        // Print the numbers
    }
}
